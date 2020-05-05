package TPCollections.annuaire;

public class Fiche implements Comparable<Fiche> {

    private String nom;
    private String numero;
    private String adresse;

    public Fiche(String nom, String numero, String adresse) {
        this.nom = nom;
        this.numero = numero;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getNum() {
        return numero;
    }

    public String getAdr() {
        return adresse;
    }

    @Override
    public String toString() {
        return nom + " " + numero + " " + adresse;
    };

    @Override
    public int compareTo(Fiche f) {
        return this.nom.compareTo(f.getNom());
    }
}
