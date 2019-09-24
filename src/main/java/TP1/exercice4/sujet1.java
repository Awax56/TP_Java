package TP1.exercice4;

public class sujet1 {

    public static void main(String[] args) {
        Compteur varLocale1 = new Compteur(1);
        Compteur varLocale2 = new Compteur(1);

        varLocale1.decremente();
        System.out.println("est a 0? " + varLocale1.aAtteintZero());
        System.out.println("est a 0? " + varLocale2.aAtteintZero());
        System.out.println("compteur ? " + varLocale1.affichecpt());

        varLocale1 = null;
        System.out.println("apres suppression, compteur ? " + varLocale2.affichecpt());
        System.gc();

        System.out.println("apres gc, compteur ? " + varLocale2.affichecpt());
        System.out.println("apres une instruction, compteur ? " + varLocale2.affichecpt());

        Compteur varLocale3 = new Compteur(1);
        Compteur varLocale4 = new Compteur(1);

        System.out.println("apres 2 nouvelles creations, compteur ? " + varLocale2.affichecpt());
        System.out.println("état du compteur 2? " + varLocale2);

        System.out.println("compteur 3 et 4 identiques equals? " + (varLocale3.equals(varLocale4)));
        System.out.println("compteur 3 et 4 identiques ==? " + (varLocale3 == varLocale4));

        String s1 = new String("aa");
        String s2 = new String("aa");
        System.out.println("aa == aa " + (s1 == s2));
        System.out.println("aa equals= aa " + (s1.equals(s2)));
    }
}
