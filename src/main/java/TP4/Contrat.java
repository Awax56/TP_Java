package TP4;

public abstract class Contrat {

    private String immatriculation;
    private String souscripteur;
    private double coef = 1;
    protected double montantAssure;
    protected int nbAccidentsEnTortDansAnnee = 0;
    protected double cotisation = 0;

    /* Q3 */
    // prochain numero de contrat
    static private int prochainNumero = 1;
    // numero du contrat
    private int numero;

    public Contrat(String souscrP, String immatP, double montantP) {
        souscripteur = souscrP;
        immatriculation = immatP;
        montantAssure = montantP;
        numero = prochainNumero;
        prochainNumero++;
    }

    double remboursementMax(double dommages) {
        if (dommages < montantAssure)
            return dommages;
        else
            return montantAssure;
    }

    void calculeNouveauCoef(int nb_accidents) {
        while (!(nb_accidents == 0)) {
            coef *= 1.25;
            nb_accidents--;
        }
    }

    public double calculeNouvelleCotisation() {
        montantAssure *= 0.8; // Decote argus
        if (nbAccidentsEnTortDansAnnee == 0) {
            coef *= 0.95;
        }
        else {
            calculeNouveauCoef(nbAccidentsEnTortDansAnnee);
        }
        // else coef *=Math.pow(1.25, nbAccidentsEnTortDansAnnee);
        return coef * cotisation;
    }

    abstract public double rembourseSurDommagesEnTort(double dommages, boolean enTort);

    // Q3
    public int getNumero() {
        return numero;
    }

    // Q6
    @Override
    public boolean equals(Object o) {
        Contrat c = (Contrat) o;
        return this.souscripteur == c.souscripteur && this.immatriculation == c.immatriculation;
    }

    public int hashcode() {
        return this.souscripteur.hashCode() + this.immatriculation.hashCode();
    }
}
