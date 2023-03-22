package R4Tablice;

public class Zadanie04k7 {
    public static void main(String[] args) {
        /*napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10x10 umieszcza w pierszej kolumnie
        liczby od 0 do 9, w drugiej kwadraty tych liczb. Natomiast w pozostałych kolumanch 0. Dodatkowo
        program oblicza sumę liczb znajdujacych się w pierwszej oraz w drugiej kolumnie.
         */
        int i, j, n = 10, sumKol0 = 0, sumKol1 = 0;
        int tab[][] = new int[n][n];
        for (i = 0; i < tab.length; i++) {
            for (j = 0; j < tab[0].length; j++) {
                if (j == 0)
                    tab[i][j] = i;
                else if (j == 1)
                    tab[i][j] = i * i;
                else
                    tab[i][j] = 0;
            }
        }
        // wyswietlenie macierzy
        for (i = 0; i < tab.length; i++) {
            for (j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < tab.length; i++) {
            sumKol0 += tab[i][0];
            sumKol1 += tab[i][1];
        }
        System.out.println("Suma liczb w kolumnie 0 wynosi: " + sumKol0);
        System.out.println("Suma liczb w kolumnie 1 wynosi: " + sumKol1);
    }
}
