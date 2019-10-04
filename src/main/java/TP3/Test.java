package TP3;

public class Test {

    public static void main(String[] args) {
//        compte jpje =  new compte("jpje");
//        jpje.credite(800);
//        jpje.debite(100);
//        jpje.editeEtat();

//        compte dspc =  new compte("dspc");
//        jpje.vireSur(dspc, 300);
//        jpje.editeEtat();
//        dspc.editeEtat();

//        compte jpje =  new compte("jpje");
//        jpje.credite(800);
//        jpje.debite(100);
//        compteAML dspc =  new compteAML("dspc");
//        jpje.vireSur(dspc, 200);
//        jpje.vireSur(dspc, 100);
//        jpje.editeEtat();
//        dspc.editeEtat();

//        compteRemunere jpje =  new compteRemunere("jpje","1/2/01");
//        jpje.credite(200,"1/07/01");
//        jpje.editeEtat("15/07/01");
//        jpje.credite(100,"1/08/01");
//        jpje.editeEtat("1/10/01");

        CompteAMemoireEntreEtats jpje =  new CompteAMemoireEntreEtats("jpje");
        jpje.enregistrer(new ChequeRecu(100, "1/9/2001", "remb. Dupont"));
        jpje.enregistrer(new InteretPercu("27/10/2001", 30,1.5));
        jpje.enregistrer(new Retrait("26/10/2001",200));
        jpje.editeEtat();
    }
}
