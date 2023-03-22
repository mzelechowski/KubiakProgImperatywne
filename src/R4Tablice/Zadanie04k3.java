package R4Tablice;

public class Zadanie04k3 {
    public static void main(String[] args) {
        /*napisz progam, który w zadeklarowanej tablcy 10x10 umieszcza 0,
        a w przękątnej ustawia 1
         */
        int n=10, suma=0;
        int tab[][]=new int[n][n];
        for (int i = 0; i < tab.length ; i++) {
            for (int j= 0; j < tab.length ; j++) {
                if(i==j)
                    tab[i][j]=1;
                else
                    tab[i][j]=0;
            }
        }

        // wyswietlenie macierzy
        for (int i = 0; i < tab.length ; i++) {
            for (int j= 0; j < tab.length ; j++) {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < tab.length ; i++) {
            suma+=tab[i][i];
        }
        System.out.println("Suma przekatnych elementow tablicy wynosi: "+suma);
    }
}
