package R4Tablice;

public class Zadanie04k12 {
    public static void main(String[] args) {
        int[] liczby = new int[6];
        int x;

        liczby[0] = 574;
        liczby[1] = 303;
        liczby[2] = 34;
        liczby[3] = 125;
        liczby[4] = 8;
        liczby[5] = 23;

        System.out.println("Dla liczb: ");
        for (int i = 0; i < liczby.length; i++) {
            if (i <= 4)
                System.out.print(liczby[i] + ", ");
            else
                System.out.print(liczby[i] + "");
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                if (liczby[j - 1] > liczby[j]) {
                    x = liczby[j - 1];
                    liczby[j - 1] = liczby[j];
                    liczby[j] = x;
                }
            }
        }
        System.out.println("");
        System.out.println("liczby uporządkowane to: ");
        for (int i = 0; i < liczby.length; i++) {
            if (i <= 4)
                System.out.print(liczby[i] + ", ");
            else
                System.out.print(liczby[i] + "");
        }
    }
}
