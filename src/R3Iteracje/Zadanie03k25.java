package R3Iteracje;

public class Zadanie03k25 {
    public static void main(String[] args) {
        /*Napisz program, który za pomocą metody monte Carlo oblicza liczbę PI
        z określoną dokładnoscią.
         */
        int n = 999999999;
        double x, y;
        int k = 0;
        for (int i = 1; i <= n; i++) {
            x = Math.random();
            y = Math.random();
            if (x * x + y * y <= 1)
                k++;
        }
        double pi = 4.0 * k / n;
        System.out.println("Obliczona liczba pi= " + pi + ".");
        System.out.println("Stała pi: " + Math.PI + ".");
        System.out.println("Różnica= " + Math.abs(Math.PI - pi) + ".");
    }
}
