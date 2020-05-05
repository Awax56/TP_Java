package TPCollections.mamusique;

import java.util.Comparator;

public class ComparateurArtiste implements Comparator<Morceau> {

    @Override
    public int compare(Morceau m1, Morceau m2) {
        return m1.getArtiste().compareTo(m2.getArtiste());
    }
}
