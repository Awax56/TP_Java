package TP4;

class Prg {
    public static void Q1() {

        ContratTousRisques c1 = new ContratTousRisques("Dupont", "1000PP22", 15000);
        ContratTiersCollision c2 = new ContratTiersCollision("Dupont", "2000PP22", 5000);

        System.out.println();
        System.out.println(c1.rembourseSurDommagesEnTort(3000, true));
        System.out.println();
        System.out.println(c1.calculeNouvelleCotisation());
        System.out.println();
        System.out.println(c2.calculeNouvelleCotisation());
        System.out.println();
        System.out.println(c2.rembourseSurDommagesEnTort(2000, true));
        System.out.println();
        System.out.println(c1.rembourseSurDommagesEnTort(13000, false));

        ContratJeuneConducteur c3 = new ContratJeuneConducteur("DupontJeune", "1000PP22", 5000);
        System.out.println();
        System.out.println(c3.rembourseSurDommagesEnTort(3000, true));
        System.out.println();
        System.out.println(c3.calculeNouvelleCotisation());
        System.out.println();
    }

    public static void Q3() {
        AssureurQ3 a = new AssureurQ3();
        try {
            int i = a.enregistreNouveauContrat("TousRisques", "Dupont", "1000PP22", 15000);
            System.out.println(a.rembourseSurDommagesEnTort(i, 13000, true));
        } catch (ContratInconnuException e) {
            System.out.println(e);
        } catch (ContratExistant e) {
            System.out.println(e);
        }

        try {
            int j = a.enregistreNouveauContrat("TiersCollision", "Dupont", "2000PP22", 5000);
            System.out.println(a.rembourseSurDommagesEnTort(j, 2000, true));
        } catch (ContratInconnuException e) {
            System.out.println(e);
        } catch (ContratExistant e) {
            System.out.println(e);
        }

        try {
            int j = a.enregistreNouveauContrat("TiersCollision", "Dupont", "2000PP22", 3000);
            System.out.println(a.rembourseSurDommagesEnTort(j, 2000, true));
        } catch (ContratInconnuException e) {
            System.out.println(e);
        } catch (ContratExistant e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // Q1();

        Q3();
    }
}
