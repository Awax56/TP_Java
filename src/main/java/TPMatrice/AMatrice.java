package TPMatrice;

public abstract class AMatrice {
    int n;

    public AMatrice(int i) {
        n = i;
    }

    public abstract int get(int i, int j);

    public abstract void put(int i, int j, int e);

    public String toString() {
        String s = "début matrice" + System.getProperty("line.separator");

        for (int k = 0; k < n; k++) {

            for (int l = 0; l < n; l++) {
                s = s + this.get(k, l) + " ";
            }
            s = s + System.getProperty("line.separator");
        }

        return s;
    }

    public void addthis(AMatrice m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.put(i, j, m.get(i, j) + this.get(i, j));
            }
        }
    }

    public AMatrice add(AMatrice m) {
        AMatrice temp = new MatriceCarree(n, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp.put(i, j, m.get(i, j) + this.get(i, j));
            }
        }
        return temp;
    }

    abstract public AMatrice buildEmpty();

    public void multthis(AMatrice m) {
        // AMatrice temp = buildEmpty();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int restemp = 0;
                for (int k = 0; k < n; k++) {
                    restemp = restemp + this.get(i, k) * m.get(k, j);
                }
                put(i, j, restemp);
                // temp.put(i,j, restemp);
            }
        }

        // La double boucle suivante peut etre mise dans une méthode :
        // public void affecter(AMatrice temp){
        /*
         * for (int i=0; i<n; i++){ for (int j=0; j<n; j++){
         * put(i,j,temp.get(i,j)); } } // } // affecter(temp);
         */
    }

    // si on doit renvoyer une nouvelle instance de matrice,
    // ou bien on place cette méthode dans la classe concrète
    // ou bien on instancie une matrice concrète
    // c'est ce qui est fait ici pour mettre en place patron method pattern
    // methode de haut niveau
    public AMatrice mult(AMatrice m) {
        AMatrice temp = new MatriceCarree(n, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int restemp = 0;
                for (int k = 0; k < n; k++) {
                    restemp = restemp + m.get(i, k) * this.get(k, j);
                }
                temp.put(i, j, restemp);
            }
        }
        return temp;
    }
}
