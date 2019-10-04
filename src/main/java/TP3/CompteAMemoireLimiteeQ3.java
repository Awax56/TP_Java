package TP3;

public class CompteAMemoireLimiteeQ3 {

    final String nom;

    private double solde = 0;
    private double totalD = 0;
    private double totalC = 0;

    public CompteAMemoireLimiteeQ3(String nomClient) {
        nom = nomClient;
    }

    public void credite(double somme) {
        solde += somme;
        totalC += somme;
    }

    public void debite(double somme) {
        solde -= somme;
        totalD += somme;
    }

    public void editeEtat() {
        System.out.println();
        System.out.println(
                "Mouvement sur " + nom + " : debité: " + totalD + " credité : " + totalC + " solde : " + solde);
        System.out.println();
        this.totalC = 0;
        this.totalD = 0;
    }

    public void vireSur(CompteAMemoireLimiteeQ3 autre, double somme) {
        if (this.equals(autre)) {
            System.out.println("virement sur un meme cpte interdit!");
        }
        else {
            this.debite(somme);
            autre.credite(somme);
        }
    }
}
