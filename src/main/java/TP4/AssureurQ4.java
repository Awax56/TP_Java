package TP4;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ListIterator;

public class AssureurQ4 {

    private Hashtable<String, LinkedList<Contrat>> assures;

    public AssureurQ4() {
        assures = new Hashtable<String, LinkedList<Contrat>>();
    }

    public int enregistreNouveauContrat(String type, String nom, String imm, double montant) {
        Contrat nouveauContrat;

        if (type == "TousRisques") {
            nouveauContrat = new ContratTousRisques(nom, imm, montant);
        }
        else {
            nouveauContrat = new ContratTiersCollision(nom, imm, montant);
        }

        // on recherche si le client est deja enregistre
        LinkedList<Contrat> listecontrat;
        // listecontrat = (LinkedList<Contrat>) assures.get(nom);
        listecontrat = assures.get(nom);

        if (listecontrat == null)
        // creation du nouveau client
        {
            LinkedList<Contrat> nouvelleListe = new LinkedList<Contrat>();
            nouvelleListe.add(nouveauContrat);
            assures.put(nom, nouvelleListe);
        }
        else
        // entree sous nom dans la table existe deja
        {
            listecontrat.add(nouveauContrat);
            assures.put(nom, listecontrat);
        }

        return nouveauContrat.getNumero();
    }

    public double rembourseEntort(String s, int i, double somme, boolean entort) {

        LinkedList<Contrat> l = assures.get(s);

        if (l != null) {
            ListIterator<Contrat> it = l.listIterator();

            Contrat c = null;
            boolean trouve = false;

            while (it.hasNext() && !trouve) {
                c = (Contrat) it.next();
                if (c.getNumero() == i) {
                    trouve = true;
                }
            }

            if (c != null) {
                return c.rembourseSurDommagesEnTort(somme, entort);
            }
            else
                return 0;

        }
        else
            return 0;
    }

    public double calculenouvelleCotisation(String s) {
        LinkedList<Contrat> l = (LinkedList<Contrat>) assures.get(s);
        if (l != null) {
            ListIterator<Contrat> it = l.listIterator();
            Contrat c = null;
            double cotisation = 0.0;
            while (it.hasNext()) {
                c = (Contrat) it.next();
                cotisation += c.calculeNouvelleCotisation();
            }
            return cotisation;
        }
        else
            return 0;
    }

}
