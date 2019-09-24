package TP1.exercice4;

public class Compteur {

    private int varinstance1;
    private static int cpt = 0;

    public Compteur(int vInit) {
        varinstance1 = vInit;
        cpt = cpt + 1;
    }

    public void decremente() {
        varinstance1--;
    }

    public boolean aAtteintZero() {
        return varinstance1 == 0;
    }

    public int affichecpt() {
        return cpt;
    }

    @Override
    public void finalize() {
        cpt--;
    }

    @Override
    public String toString() {
        return "" + varinstance1;
    }

    public boolean equals(Compteur c) {
        return this.varinstance1 == c.varinstance1;
    }

    @Override
    public int hashCode() {
        return varinstance1;
    }
}
