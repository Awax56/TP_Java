package TP4;

import java.util.ArrayList;

public class AssureurQ3 {

    private ArrayList<Contrat> contrats;

    public AssureurQ3() {
        contrats = new ArrayList<Contrat>();
    }

    public int enregistreNouveauContrat(String typeContratDemande, String souscripteurP, String immatriculationP,
            double montantAssureP) throws ContratInconnuException, ContratExistant {
        // creation d'un nouveau contrat de type typeContratDemande s'il existe
        // et enregistrement

        Contrat nouveauContrat;
        if (typeContratDemande.equals("TiersCollision")) {
            nouveauContrat = new ContratTiersCollision(souscripteurP, immatriculationP, montantAssureP);
        }
        else if (typeContratDemande.equals("TousRisques")) {
            nouveauContrat = new ContratTousRisques(souscripteurP, immatriculationP, montantAssureP);
        }
        else {
            throw new ContratInconnuException();
        }

        if (contrats.contains(nouveauContrat)) {
            throw new ContratExistant();
        }

        int indiceDansContrats = nouveauContrat.getNumero() - 1;
        contrats.add(indiceDansContrats, nouveauContrat);
        return nouveauContrat.getNumero();
    }

    public double rembourseSurDommagesEnTort(int numero, double dommages, boolean enTort) {
        Contrat c = (Contrat) contrats.get(numero - 1);
        if (c == null) {
            System.out.println("numero fourni incorrect");
            System.exit(0);
        }
        return c.rembourseSurDommagesEnTort(dommages, enTort);
    }
}
