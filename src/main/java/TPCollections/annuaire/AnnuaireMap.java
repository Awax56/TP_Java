package TPCollections.annuaire;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class AnnuaireMap {

    private HashMap<String, Fiche> mesContacts;
    private TreeMap<String, Fiche> mesContactsTries;

    public AnnuaireMap() {
        mesContacts = new HashMap<String, Fiche>();
        mesContactsTries = new TreeMap<String, Fiche>();
    }

    public void afficheContact(String nom) {
        Fiche f = mesContacts.get(nom);
        if (f != null) {
            System.out.println(f);
        }
    }

    public void afficheContacts() {
        System.out.println("Test");
        System.out.println(mesContacts);

        System.out.println("Avec HashMap");
        for (Entry<String, Fiche> e : mesContacts.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println("Avec TreeMap");
        for (Entry<String, Fiche> e : mesContactsTries.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        // pas possible avec leur version de java
        Set<String> contactsSet = mesContacts.keySet();
        Iterator<String> it = contactsSet.iterator();
        while (it.hasNext()) {
            String cle = (String) it.next();
            System.out.println(mesContacts.get(cle));
        }

    }

    public void enregistrerFiche(String nom, String tel, String adr) {
        Fiche nFiche = new Fiche(nom, tel, adr);
        mesContacts.put(nom, nFiche);
        mesContactsTries.put(nom, nFiche);
    }

    public static void main(String[] args) {
        AnnuaireMap m = new AnnuaireMap();
        m.enregistrerFiche("pat", "1235", "adr2");
        m.enregistrerFiche("sacha", "1234", "adr1");
        m.enregistrerFiche("charlotte", "1234", "adr1");

        m.afficheContact("pat");
        m.afficheContacts();
    }
}

class ComparateurFiche implements Comparator<String> {

    Map<String, Fiche> base;

    public ComparateurFiche(Map<String, Fiche> base) {
        this.base = base;
    }

    @Override
    public int compare(String a, String b) {
        return base.get(a).compareTo(base.get(b));
    }
}
