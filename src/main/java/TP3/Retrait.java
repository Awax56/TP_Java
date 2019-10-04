package TP3;

public class Retrait extends Operation {

    public Retrait(String d, double m) {
        super(-m, d);
    }

    @Override
    public void editeOp() {
        System.out.println("\t" + super.dateop + "\t retrait \t\t\t\t " + super.montant * (-1));
    }
}
