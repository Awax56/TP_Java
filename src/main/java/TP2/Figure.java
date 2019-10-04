package TP2;

public abstract class Figure {

    protected Point p;

    public Figure(double x, double y) {
        p = new Point(x, y);
    }

    public void translation(double x, double y) {
        p.translate(x, y);
    }

    public abstract double perimetre();

    @Override
    public abstract String toString();
}
