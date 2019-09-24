package TP1.exercice1;

public class De {

    public int valeur;

    public De() {
        this.valeur = 1;
    }

    public void lancer() {
        // random renvoie un double dans [0,1[
        // (int) cast explicite renvoie la partie entiere de double
        this.valeur = (int) (6 * Math.random()) + 1;
    }
}