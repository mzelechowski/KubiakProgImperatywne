package R4Tablice;

public class Zadanie04k11 {
    public static void main(String[] args) {
        /*Dane są dwie macierze o nazwach a i b - ich postać jest taka sama jak w
        zadaniu 4.9. Napisz program któy oblicza iloczyn macierzy i wświetla na ekranie kompa
         */
        int n=10;
        int tab1[][]=new int[n][n];
        int tab2[][]=new int[n][n];
        int tab3[][]=new int[n][n];

        int tab[][]=new int[n][n];
        for (int i = 0; i < tab.length ; i++) {
            for (int j= 0; j < tab.length ; j++) {
                tab1[i][j]=1;
                tab2[i][j]=2;
                tab3[i][j]=tab1[i][j]*tab2[i][j];
            }
        }
        // wyswietlenie macierzy po przepisaniu
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1.length; j++) {
                System.out.print(tab3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
