package TP2;

public class Cercle extends Figure {

    protected double rayon;

    public Cercle(double r, double x, double y) {
        super(x, y);
        rayon = r;
    }

    @Override
    public double perimetre() {
        return 0.0;
    }

    @Override
    public String toString() {
        return " ";
    }
}
