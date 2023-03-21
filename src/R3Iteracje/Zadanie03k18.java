package R3Iteracje;

public class Zadanie03k18 {
    public static void main(String[] args) {
        /*napisz program, który  za pomocą instrukcji while() znajduje największą i najmniejszą liczbę
        ze zbioru n wylosowanych liczb całkowitych od 0 do 99 (w zadaniu n=5) oraz oblicza średnią ze
        wszystkich wylosowanych liczb
         */
        int min = 99, max = 0, n = 5, random, average = 0;
        int[] tab = new int[5];
        int i = 0;
        while (i < n) {
            random = (int) Math.floor(Math.random() * 100);
            if (min > random) min = random;
            if (max < random) max = random;
            average += random;
            tab[i] = random;
            i++;
        }
        System.out.println("Wylosowano następujace liczby: ");
        for (int t : tab) System.out.print(t + ",");
        System.out.println();
        System.out.println("Największa liczba z wylosowanego zbioru to: " + max);
        System.out.println("Najmniejsza liczba z wylosowanego zbioru to: " + min);
        System.out.println("Srednia z wylosowanych liczb wynosi: " + average / n);
    }
}
