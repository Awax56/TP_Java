package TP1.exercice1;

public class Jeu2D {

    public static void main(String[] args) {
        De d1 = new De();
        De d2 = new De();
        int somme;
        // lancer des dés
        d1.lancer();
        d2.lancer();
        somme = d1.valeur + d2.valeur;

        System.out.println("la somme des dés vaut " + somme);
        System.out.println("le premier dé vaut " + d1.valeur);
        System.out.println("le deuxième dé vaut " + d2.valeur);
        System.out.println("FIN...");
    }
}
