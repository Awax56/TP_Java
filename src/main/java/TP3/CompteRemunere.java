package TP3;

public class CompteRemunere extends CompteAMemoireLimitee {

    final double taux = 0.05;
    private DateModifiable derniereDate;

    public CompteRemunere(String nomClient, String d) {
        super(nomClient);
        derniereDate = new DateModifiable(d);
    }

    private void calculInteret(String d) {
        double interet = 0;
        derniereDate.modifieToi(d);
        if ((this.getSolde() > 0) && (derniereDate.nbJoursDepuisDerniereMAJ() != 0)) {
            interet = this.getSolde() * taux * derniereDate.nbJoursDepuisDerniereMAJ();
            super.credite(interet);
        }
    }

    public void credite(double somme, String d) {
        this.calculInteret(d);
        super.credite(somme);
    }

    public void debite(double somme, String d) {
        this.calculInteret(d);
        super.debite(somme);
    }

    public void vireSur(Compte autre, double somme, String d) {
        this.calculInteret(d);
        super.vireSur(autre, somme);
    }

    public void editeEtat(String d) {
        this.calculInteret(d);
        super.editeEtat();
    }
}
