package TPMatrice;

import java.util.*;

public class MatriceCreuse extends AMatrice {

    LinkedList<elementMatrice> mat;

    public MatriceCreuse(int n) {
        super(n);
        mat = new LinkedList<elementMatrice>();
    }

    public MatriceCreuse(int v, int n) {
        super(n);
        mat = new LinkedList<elementMatrice>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat.add(new elementMatrice(i, j, v));
            }
        }
    }

    // méthode de bas niveau dépendante de l'implémentation de la matrice
    public int get(int i, int j) {
        Iterator<elementMatrice> it = mat.iterator();
        boolean trouve = false;
        int ent = 0; // valeur par défaut mieux avec des exceptions... à
                     // demander à ceux qui avancent vite
        while (it.hasNext() && !(trouve)) {
            elementMatrice e = it.next();
            if ((e.get_i() == i) && (e.get_j() == j)) {
                trouve = true;
                ent = e.get_value();
            }
        }
        return ent;
    }

    // méthode de bas niveau dépendante de l'implémentation de la matrice
    public void put(int i, int j, int e) {
        // avant retrouver si l'élément n'existe pas déjà
        elementMatrice em = new elementMatrice(i, j, e);
        mat.add(em);

    }

    public AMatrice buildEmpty() {
        return new MatriceCreuse(0, n);
    }

}
