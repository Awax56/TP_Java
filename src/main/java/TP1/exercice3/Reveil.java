package TP1.exercice3;

public class Reveil {
    int delai;
    int alarmeH;
    int alarmeM;

    Cafetiere macaf;
    Portable p;

    public Reveil(int d, Cafetiere c, Portable mp) {
        delai = d;
        macaf = c;
        p = mp;
    }

    public void dort() {
        // sans tenir compte des changements de jour
        alarmeM += delai;
        if (alarmeM >= 60) {
            alarmeM -= 60;
            alarmeH += 1;
        }
        System.out.println("Le réveil demande à la cafetiere d'attendre...");
        macaf.decaler(delai);
        p.send("tu es en retard", delai);
    }
}
