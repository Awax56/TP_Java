package TP1.exercice1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Jeu421 {

    public static boolean gagne(De de1, De de2, De de3) {
        int bon = 0;

        // quatre
        if ((de1.valeur == 4) || (de2.valeur == 4) || (de3.valeur == 4))
            bon++;

        // deux
        if ((de1.valeur == 2) || (de2.valeur == 2) || (de3.valeur == 2))
            bon++;

        // un
        if ((de1.valeur == 1) || (de2.valeur == 1) || (de3.valeur == 1))
            bon++;

        return (bon == 3);
    }

    public static void main(String[] args) throws java.io.IOException {
        De de1 = new De();
        De de2 = new De();
        De de3 = new De();
        int nb_essais = 0;
        int n;

        de1.lancer();
        de2.lancer();
        de3.lancer();

        while (!Jeu421.gagne(de1, de2, de3)) {
            nb_essais++;
            System.out.println(" dé 1 : " + de1.valeur);
            System.out.println(" dé 2 : " + de2.valeur);
            System.out.println(" dé 3 : " + de3.valeur);
            // recuperation du flot d'entree clavier
            InputStreamReader lecteur = new InputStreamReader(System.in);
            // recuperation du buffer
            BufferedReader input = new BufferedReader(lecteur);
            System.out.println("Quel dé relancer ?");

            n = Integer.parseInt(input.readLine());
            // n = Console.readInt("Quel dé relancer ?");
            switch (n) {
            case 1:
                de1.lancer();
                break;
            case 2:
                de2.lancer();
                break;
            case 3:
                de3.lancer();
                break;
            }
        }
        System.out.println(" dé1 : " + de1.valeur);
        System.out.println(" dé2 : " + de2.valeur);
        System.out.println(" dé 3 : " + de3.valeur);
        System.out.println("Gagné en " + nb_essais + " coups");
    }
}
