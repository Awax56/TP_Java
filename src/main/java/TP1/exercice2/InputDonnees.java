package TP1.exercice2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputDonnees {

    public static void main(String[] args) throws java.io.IOException {
        InputStreamReader lecteur = new InputStreamReader(System.in);
        BufferedReader entree = new BufferedReader(lecteur);
        String chainelue;

        // operation sur chaine de car
        System.out.println("Saisir votre chaine ");
        chainelue = entree.readLine();
        System.out.println("la chaine saisie est " + chainelue);

        // operation sur char
        System.out.println("Saisir votre char ");

        chainelue = entree.readLine();
        char[] c = chainelue.toCharArray();
        char car = c[0];

        System.out.println("le car saisi est " + car);

        // operations sur entier
        int entierlu;
        System.out.println("Saisir votre entier ");

        entierlu = Integer.parseInt(entree.readLine());
        System.out.println("l'entier saisi est " + entierlu);

        double doublelu;
        System.out.println("Saisir votre rel double ");
        doublelu = Double.parseDouble(entree.readLine());
        System.out.println("l'entier saisi est " + doublelu);
    }
}
