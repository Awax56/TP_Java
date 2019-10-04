package TP3;

public class InteretPercu extends Operation {
    private int nbrejour;

    public InteretPercu(String d, int nbre, double m) {
        super(m, d);
        nbrejour = nbre;
    }

    @Override
    public void editeOp() {
        System.out.println(
                "\t" + super.dateop + "\t int�r�ts \t\t" + "cr�diteur " + this.nbrejour + " j\t\t\t " + super.montant);
    }
}
