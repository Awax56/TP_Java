package TP1.exercice3;

public class MaisonConnectee {

    public static void main(String[] args) {
        GrillePain mongp = new GrillePain(7, 35);
        Cafetiere macafetiere = new Cafetiere(7, 30, mongp);
        Portable monport = new Portable();
        Reveil monreveil = new Reveil(10, macafetiere, monport);

        System.out.println("Le réveil sonne et toto appuie sur sleep...");
        monreveil.dort();
    }
}
