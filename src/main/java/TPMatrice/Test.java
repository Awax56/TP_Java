package TPMatrice;

public class Test {
    
    public static void main(String[] args) {
        MatriceCarree m = new MatriceCarree(2, 2);
        System.out.println(m);
        MatriceCarree n = new MatriceCarree(2, 1);
        n.addthis(m);
        System.out.println(n);
        MatriceCarree m1 = new MatriceCarree(2, 2);
        MatriceCarree m2 = new MatriceCarree(2, 3);
        AMatrice mm = m1.mult(m2);
        System.out.println(mm);
    }
}
