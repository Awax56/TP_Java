package TP2;

public class Rectangle {

    Point base; // Base en bas a gauche
    double xlength; // Dimension horizontale
    double ylength; // Dimension verticale
    static int nbr = 0; // Nombre de rectangles
    // Rectangle construit en fonction du Point de base et des dimensions

    public Rectangle(Point base, double xLength, double yLength) {
        // Si une des deux dimensions est negative, il faut calculer
        // la veritable base du rectangle
        if (xLength < 0 || yLength < 0) {
            double xbase = base.get_x(); // Abscisse de la base
            double ybase = base.get_y(); // Ordonnee de la base
            if (xlength < 0) {
                this.xlength = -xLength;
                xbase = base.get_x() - xLength;
            }
            if (ylength < 0) {
                this.ylength = -yLength;
                ybase = base.get_y() - yLength;
            }
            // Creation du nouveau point de base du rectangle
            this.base = new Point(xbase, ybase);
        }
        else {
            // Mise en place du point de base et des dimensions
            this.base = base;
            this.xlength = xLength;
            this.ylength = yLength;
        }
        // Incrementation du nombre d'objets de la classe
        nbr++;
    }

    // Rectangle construit en fonction de la base et d'un autre point
    public Rectangle(Point base, Point other) {
        this(base, other.get_x() - base.get_x(), other.get_y() - base.get_y());
        // l'utilisation de this est importante si le premier point n'est
        // pas en bas a gauche
    }

    // Rectangle construit en fonction des coordonnees de la base
    // et des dimensions
    Rectangle(double x, double y, double xlength, double ylength) {
        this(new Point(x, y), xlength, ylength);
    }

    // Affichage
    @Override
    public String toString() {
        return base + "\n xlength : " + xlength + " ylength : " + ylength;
        /*
         * return "(" + base.get_x() + "+" + xlength + "," + base.get_y() + "+"
         * + ylength + ")";
         */
    }

    // egalite
    @Override
    public boolean equals(Object or) {
        if (or instanceof Rectangle) {
            Rectangle r = (Rectangle) or;
            return base.equals(r.base) && xlength == r.xlength && ylength == r.ylength;
        }
        else {
            return false;
        }

    }

    // Translation
    public void translate(double dx, double dy) {
        base.translate(dx, dy);
    }

    // Surface
    public double surface() {
        return xlength * ylength;
    }

    // Appartenance d'un point au rectangle
    public boolean contains(Point p) {
        return base.get_x() <= p.get_x() && p.get_x() <= base.get_x() + xlength && base.get_y() <= p.get_y()
                && p.get_y() <= base.get_y() + ylength;
    }

    // Inclusion d'un rectangle dans ce rectangle
    public boolean contains(Rectangle r) {
        return contains(r.base) && r.base.get_x() + r.xlength <= base.get_x() + xlength
                && r.base.get_y() + r.ylength <= base.get_y() + ylength;
    }
    // Methode statique
    // Calcul du rectangle englobant d'une liste de rectangles

    public static Rectangle englobe(Rectangle[] list) {

        // initialisation

        // Abcisse minimale par defaut
        double xmin = list[0].base.get_x();
        // Abcisse maximale par defaut
        double xmax = list[0].base.get_x() + list[0].xlength;
        // Ordonnee minimale par defaut
        double ymin = list[0].base.get_y();
        // ordonnee maximale par defaut
        double ymax = list[0].base.get_y() + list[0].ylength;

        // Parcours des rectangles pour trouver le minimum et
        // le maximum des abcisses et des ordonnees
        for (int i = 1; i < list.length; i++) {
            if (list[i].base.get_x() < xmin)
                xmin = list[i].base.get_x();

            if (list[i].base.get_x() + list[i].xlength > xmax)
                xmax = list[i].base.get_x() + list[i].xlength;

            if (list[i].base.get_y() < ymin)
                ymin = list[i].base.get_y();

            if (list[i].base.get_y() + list[i].ylength > ymax)
                ymax = list[i].base.get_y() + list[i].ylength;
        }
        // Creation du rectangle
        return new Rectangle(new Point(xmin, ymin), xmax - xmin, ymax - ymin);
    }
}
