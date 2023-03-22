package R4Tablice;

public class Zadanie04k5 {
    public static void main(String[] args) {
        /*napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10x10 o nazwie
        macierz umieszcza liczby 1 i 0 zgodnie z przedstawioną poniżej interpretacją graiczną.
        Program dodatkowo powinien oblczać sumę elementów przekątnej.
         */
        int n=10, suma=0;
        int tab[][]=new int[n][n];
        for (int i = 0; i < tab.length ; i++) {
            for (int j= 0; j < tab.length ; j++) {
                if((i+j)==(n-1))
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
            suma+=tab[i][n-i-1];
        }
        System.out.println("Suma przekatnych elementow tablicy wynosi: "+suma);
    }
}
