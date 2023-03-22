package R4Tablice;

public class Zadanie04k8 {
    public static void main(String[] args) {
        /*przepisz table zamieniajac kolumny z wierzami*/
        int n=10;
        int tab[][]=new int[n][n];
        int tab1[][]=new int[n][n];
        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab.length ; j++) {
                tab[j][i]=i;
            }
        }
        // wyswietlenie macierzy
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n Tablica po przepisaniu \n");
        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab.length ; j++) {
                tab1[i][j]=tab[j][i];
            }
        }
        // wyswietlenie macierzy po przepisaniu
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1.length; j++) {
                System.out.print(tab1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
