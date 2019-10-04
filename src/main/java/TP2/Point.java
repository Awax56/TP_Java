package TP2;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Affichage (classe object non vue pour le moment)
    public String afficher() {
        return "(" + x + "," + y + ")";
    }

    // Sinon
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double distance(Point p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public boolean equals(Object op) {
        if (op instanceof Point) {
            Point p = (Point) op;
            return x == p.x && y == p.y;
        }
        else {
            return super.equals(op);
        }
    }

    public double get_x() {
        return this.x;
    }

    public double get_y() {
        return this.y;
    }

    // changement de repere, utile au cas des rectangles penches
    public Point changement_repere(double angle) {
        // trouve les coordonnees du point base dans le repere incline d'angle
        // angle
        double xx = this.x * Math.cos(angle) + this.y * Math.sin(angle);
        double yy = this.x * Math.sin(angle) * (-1) + this.y * Math.cos(angle);
        return new Point(xx, yy);
    }
}
