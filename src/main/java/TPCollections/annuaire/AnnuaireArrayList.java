package TPCollections.annuaire;

import java.util.ArrayList;
import java.util.Collections;

public class AnnuaireArrayList {

    private ArrayList<Fiche> mesContacts;

    public AnnuaireArrayList() {
        mesContacts = new ArrayList<>();
    }

    public void afficheContact(String nom) {
        for (Fiche f : mesContacts) {
            if (f.getNom() == nom) {
                System.out.println(f);
            }
        }
    }

    public void afficheContacts() {
        for (Fiche f : mesContacts) {
            System.out.println(f);
        }
    }

    public void afficheContactsTries() {
        Collections.sort(mesContacts);
        for (Fiche f : mesContacts) {
            System.out.println(f);
        }
    }

    public void enregistrerFiche(String nom, String tel, String adr) {
        mesContacts.add(new Fiche(nom, tel, adr));
    }

    public static void main(String[] args) {
        AnnuaireArrayList m = new AnnuaireArrayList();
        m.enregistrerFiche("sacha", "1234", "adr1");
        m.enregistrerFiche("charlotte", "1234", "adr1");
        m.enregistrerFiche("pat", "1235", "adr2");

        m.afficheContact("pat");
        m.afficheContacts();
        m.afficheContactsTries();
    }
}
