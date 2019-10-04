package TP2;

public class Segment {

    private Point p1;
    private Point p2;

    public Segment(Point pp1, Point pp2) {
        p1 = pp1;
        p2 = pp2;
    }

    public Segment(Double px, Double py, Double ppx, Double ppy) {
        this(new Point(px, py), new Point(ppx, ppy));
    }

    public Segment(Point pp) {
        this(new Point(0, 0), pp);
    }

    // Methode d'instance
    // simplification indique memes coordonnees pour les points
    @Override
    public boolean equals(Object os) {
        if (os instanceof Segment) {
            Segment s = (Segment) os;
            return this.p1.get_x() == s.p1.get_x() && this.p1.get_y() == s.p1.get_y() && this.p2.get_x() == s.p2.get_x()
                    && this.p2.get_y() == s.p2.get_y();
        }
        else {
            return false;
        }
    }

    // Methode de classe de comparaison
    public static boolean equal_to(Segment s1, Segment s2) {
        return s1.equals(s2);
    }

    // intersection
    // principe
    /*
     * public Point intersection(Segment s){ double c,cp,xi,yi; //... if (c!=cp)
     * {return new Point(xi,yi);} else return null; }
     */
}
