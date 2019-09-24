package TP1.exercice1;

class Jeu {

    public static void main(String[] args) {
        De de1 = new De();
        De de2 = new De();

        System.out.println("Lancer de de");
        de1.lancer();
        System.out.println("Le de vaut : " + (de1.valeur + de2.valeur));
    }
}
