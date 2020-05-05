package TPMatrice;

import java.util.*;

public class MatriceCarree extends AMatrice {

    ArrayList<ArrayList<Integer>> mat;

    public MatriceCarree(int taille, int e) {
        super(taille);
        mat = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> ligne;
        for (int i = 0; i < n; i++) {
            ligne = new ArrayList<Integer>();
            // sans initialisation impossible d'accéder à toute case i,j
            for (int k = 0; k < n; k++) {
                ligne.add(k, e);
            }
            mat.add(i, ligne);
        }
    }

    public AMatrice buildEmpty() {
        return new MatriceCarree(0, n);
    }

    // méthode de bas niveau dépendante de l'implémentation de la matrice
    public int get(int i, int j) {
        return mat.get(i).get(j);
    }

    // méthode de bas niveau dépendante de l'implémentation de la matrice
    public void put(int i, int j, int e) {
        mat.get(i).set(j, e);
        // conversion implicite
    }

}
