package TP1.exercice3;

public class Cafetiere {

    int heureD;
    int minD;

    GrillePain toasteur;

    public Cafetiere(int h, int m, GrillePain gp) {
        heureD = h;
        minD = m;
        toasteur = gp;
    }

    public void decaler(int delai) {
        // sans tenir compte des changements de jour
        minD += delai;
        if (minD >= 60) {
            minD -= 60;
            heureD += 1;
        }
        System.out.println("La cafetiere demande au toasteur de dormir un peu plus...");
        toasteur.dort(delai);
    }
}
