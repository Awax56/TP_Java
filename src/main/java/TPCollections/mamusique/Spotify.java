package TPCollections.mamusique;

import java.util.*;

public class Spotify {

    ArrayList<Morceau> mesMorceaux;
    HashSet<Morceau> mesMorceauxUniquesNonTries;
    TreeSet<Morceau> mesMorceauxTries;

    public Spotify() {
        mesMorceaux = new ArrayList<>();
        mesMorceauxUniquesNonTries = new HashSet<>();
        mesMorceauxTries = new TreeSet<>();
    }

    public void addMorceau(String titre, String artiste) {
        mesMorceaux.add(new Morceau(titre, artiste));
        mesMorceauxUniquesNonTries.add(new Morceau(titre, artiste));
        mesMorceauxTries.add(new Morceau(titre, artiste));
    }

    @Override
    public String toString() {
        String s = "";
        for (Morceau m : mesMorceaux) {
            s += m.getTitre() + " " + m.getArtiste() + "\n";
        }
        return s;
    }

    public void ordonnerParTitre() {
        Collections.sort(mesMorceaux);
    }

    class InnerComparateurArtiste implements Comparator<Morceau> {

        @Override
        public int compare(Morceau m1, Morceau m2) {
            return m1.getArtiste().compareTo(m2.getArtiste());
        }
    }

    public void ordonnerParArtiste() {
        Collections.sort(mesMorceaux, new InnerComparateurArtiste());
    }

    public void afficherMesMorceaux() {
        System.out.println("L'ensemble des morceaux");
        for (Morceau m : mesMorceauxTries) {
            System.out.println(m.getTitre() + " " + m.getArtiste());
        }
        System.out.println("");
    }

    public String getMorceau(int i) {
        return mesMorceaux.get(i).getTitre() + mesMorceaux.get(i).getArtiste();
    }

    public static void main(String[] args) {
        Spotify spotify = new Spotify();
        spotify.addMorceau("Neuf mois fermes", "Camille");
        spotify.addMorceau("La javanaise", "Serge Gainsbourg");
        spotify.addMorceau("Alouette", "Inconnu");
        spotify.addMorceau("Neuf mois fermes", "Camille");

        System.out.println("Affichage de la playlist...");
        System.out.println(spotify);
        System.out.println("M0==M3 " + spotify.getMorceau(0).equals(spotify.getMorceau(3)));
        System.out.println("M1==M3 " + spotify.getMorceau(1).equals(spotify.getMorceau(3)));

        System.out.println("Affichage de l'ensemble des morceaux de la playlist...");
        spotify.afficherMesMorceaux();

        spotify.ordonnerParTitre();
        System.out.println(spotify);
        spotify.ordonnerParArtiste();
        System.out.println(spotify);

    }

}
