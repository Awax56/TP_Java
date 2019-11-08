package TP4;

public class ContratJeuneConducteur extends ContratTiersCollision {
    static private double surprime;

    public ContratJeuneConducteur(String souscrP, String immatP, double montantP) {
        super(souscrP, immatP, montantP);
        surprime = 200;
    }

    @Override
    public double calculeNouvelleCotisation() {
        double temp = super.calculeNouvelleCotisation() + surprime;
        return temp;
    }
}
