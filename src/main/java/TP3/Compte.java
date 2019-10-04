package TP3;

public class Compte {

    private double solde = 0;
    final String nom;

    public Compte(String nomClient) {
        nom = nomClient;
    }

    public void credite(double somme) {
        solde += somme;
    }

    public void debite(double somme) {
        solde -= somme;
    }

    public void editeEtat() {
        System.out.println();
        System.out.println("Solde du compte " + nom + " : " + solde);
        System.out.println();
    }

    public double getSolde() {
        return solde;
    }

    public void vireSur(Compte autre, double somme) {
        if (this.equals(autre)) {
            System.out.println("virement sur un meme cpte interdit!");
        }
        else {
            this.debite(somme);
            autre.credite(somme);
        }
    }
}
