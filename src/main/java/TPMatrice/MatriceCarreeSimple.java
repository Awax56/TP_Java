package TPMatrice;

import java.util.*;

public class MatriceCarreeSimple {
    int n;
    ArrayList<ArrayList<Integer>> mat;

    public MatriceCarreeSimple(int taille, int e) {
        n = taille;
        mat = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> ligne;

        for (int i = 0; i < n; i++) {
            ligne = new ArrayList<Integer>();
            for (int k = 0; k < n; k++) {
                ligne.add(k, e);
            }
            mat.add(i, ligne);
        }
    }

    // méthode de bas niveau dépendante de l'implémentation de la matrice
    public int get(int i, int j) {
        return mat.get(i).get(j);
    }

    // méthode de bas niveau dépendante de l'implémentation de la matrice
    public void put(int i, int j, int e) {
        mat.get(i).set(j, e);
        // autre solution possible via une conversion implicite
        // mat.get(i).add(j,e);
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s = s + this.get(i, j) + " ";
            }
            s = s + System.getProperty("line.separator");
        }
        return s;
    }

    // méthode de haut niveau, indépendante de l'implémentation mais dépendante
    // des accesseurs publics

    public MatriceCarreeSimple add(MatriceCarreeSimple m) {
        MatriceCarreeSimple temp = new MatriceCarreeSimple(n, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp.put(i, j, m.get(i, j) + this.get(i, j));
            }
        }
        return temp;
    }

    // méthode de haut niveau, indépendante de l'implémentation mais dépendante
    // des accesseurs publics
    // et du produit
    public MatriceCarreeSimple mult(MatriceCarreeSimple m) {
        MatriceCarreeSimple temp = new MatriceCarreeSimple(n, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int restemp = 0;
                for (int k = 0; k < n; k++) {
                    restemp = restemp + this.get(i, k) * m.get(k, j);
                }
                temp.put(i, j, restemp);
            }
        }
        return temp;
    }
}
