package TPCollections.mamusique;

public class Morceau implements Comparable<Morceau> {

    private String titre;
    private String artiste;

    public Morceau(String titre, String artiste) {
        this.titre = titre;
        this.artiste = artiste;
    }

    @Override
    public int compareTo(Morceau morceau) {
        return this.titre.compareTo(morceau.titre);
    }

    public String getTitre() {
        return titre;
    }

    public String getArtiste() {
        return artiste;
    }

    @Override
    public boolean equals(Object object) {
        Morceau morceau = (Morceau) object;
        return titre == morceau.titre && artiste == morceau.artiste;
    }

    @Override
    public int hashCode() {
        return this.titre.hashCode();
    }
}
