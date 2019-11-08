package TP4;

public class ContratTousRisques extends Contrat {

    static private double franchise = 500;

    public ContratTousRisques(String souscrP, String immatP, double montantP) {
        super(souscrP, immatP, montantP);
        cotisation = 800;
    }

    @Override
    public double rembourseSurDommagesEnTort(double dommages, boolean enTords) {
        // double res = super.remboursementMax(dommages);
        if (!enTords) {
            // return res;
            return Math.min(dommages, super.montantAssure);
        }
        else {
            nbAccidentsEnTortDansAnnee++;
            double res = Math.min(dommages, super.montantAssure) - franchise;
            return (res > 0) ? res : 0;
        }
    }
}
