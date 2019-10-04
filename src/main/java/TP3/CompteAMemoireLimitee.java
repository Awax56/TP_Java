package TP3;

public class CompteAMemoireLimitee extends Compte {

    private double totalD = 0;
    private double totalC = 0;

    public CompteAMemoireLimitee(String nomClient) {
        super(nomClient);
    }

    @Override
    public void credite(double somme) {
        super.credite(somme);
        totalC += somme;
    }

    @Override
    public void debite(double somme) {
        super.debite(somme);
        totalD += somme;
    }

    @Override
    public void editeEtat() {
        System.out.println();
        System.out.println("Mouvement sur " + nom + " : debite : " + totalD + " credite : " + totalC + " solde : "
                + this.getSolde());
        System.out.println();
        this.totalC = 0;
        this.totalD = 0;
    }
}
