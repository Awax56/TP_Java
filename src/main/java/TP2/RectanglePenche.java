package TP2;

public class RectanglePenche extends Rectangle {

    private double angle;

    public RectanglePenche(Point base, double xlength, double ylength, double angle) {
        // ok
        super(base, xlength, ylength);
        this.angle = angle;
    }

    public RectanglePenche(Point base, Point other, double d) {
        // ko : il faudrait effectuer un changement de repère sur base et other
        // pour pouvoir utiliser le constructeur de la classe mère

        super(base, other);
        this.angle = d;
    }

    public RectanglePenche(double x, double y, double xlength, double ylength, double d) {
        // ko : il faudrait effectuer un changement de repère le point (x,y)
        // pour pouvoir utiliser le constructeur de la classe mère

        super(x, y, xlength, ylength);
        this.angle = d;
    }

    public void rotation(double alpha) {
        this.angle += alpha;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Inclinaison de " + angle;
    }

    public boolean sameAs(RectanglePenche rr) {
        return super.equals(rr) && this.angle == rr.angle;
    }

    @Override
    public boolean contains(Point p) {
        // Principe
        // i) proceder au changement de repere du rectangle (temporairement) :
        // adopter le repere orthonorme penche
        // ii) trouver les coordonnees de p dans cette base
        // iii) tester si le point appartient au rectangle dans le repere penche
        // : appel de la methode contains de Rectangle
        Point backupbase = base;
        base = base.changement_repere(angle);
        Point pp = p.changement_repere(angle);
        boolean res = super.contains(pp);
        base = backupbase;
        return res;
    }

    @Override
    public boolean contains(Rectangle r) {
        // Principe pour r non penché i.e. dans le repère orthonormé initial
        // i) proceder au changement de repere
        // ii) generer les quatre points de r et proceder au changement de
        // repere
        // iii) tester si chacun des points est contenu dans this
        Point backupbase = base;
        base = base.changement_repere(angle);
        // recuperation des points de r dans son repère et changement de base
        // des 4 points dans celui de this
        Point rp1 = r.base.changement_repere(angle);
        Point rp2 = new Point(r.base.get_x() + r.xlength, r.base.get_y()).changement_repere(angle);
        Point rp3 = new Point(r.base.get_x(), r.base.get_y() + r.ylength).changement_repere(angle);
        Point rp4 = new Point(r.base.get_x() + r.xlength, r.base.get_y() + r.ylength).changement_repere(angle);

        // test d'appartenance
        boolean res = super.contains(rp1) && super.contains(rp2) && super.contains(rp3) && super.contains(rp4);
        base = backupbase;
        return res;
    }

    /*
     * public boolean contains(RectanglePenche r) { pour le faire mieux il faut
     * d'abord récupérer les coordonnées des points de r dans son repère =>
     * définir un get coordonnées pour rectangle et rectangle penché on effectue
     * un changement de repère de ces points dans celui de this on effectue de
     * test de containment }
     */
}
