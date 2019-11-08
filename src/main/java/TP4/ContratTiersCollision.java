package TP4;

public class ContratTiersCollision extends Contrat {

    public ContratTiersCollision(String souscrP, String immatP, double montantP) {
        super(souscrP, immatP, montantP);
        cotisation = 400;
    }

    @Override
    public double rembourseSurDommagesEnTort(double dommages, boolean enTords) {
        // double res=super.remboursementMax(dommages);
        if (!enTords) {
            // return res;
            return Math.min(dommages, super.montantAssure);
        }
        else {
            nbAccidentsEnTortDansAnnee++;
            return 0;
        }
    }
}
