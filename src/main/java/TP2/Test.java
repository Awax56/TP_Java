package TP2;

public class Test {

    public static void main(String[] args) {
        Point p = new Point(1, 2);
        Rectangle r = new Rectangle(p, 2, 3);
        Rectangle t = new RectanglePenche(p, 2, 3, 45);
        RectanglePenche s = new RectanglePenche(p, 2, 3, 56);

        System.out.println(r.surface());
        // r.rotation(2);
        System.out.println(r.contains(p));

        System.out.println(t.surface());
        // t.rotation(2);
        System.out.println(t.contains(p));

        System.out.println(s.surface());
        s.rotation(2);
        System.out.println(s.contains(p));
        System.out.println(s);
    }
}
