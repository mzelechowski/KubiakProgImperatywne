package R5Obiektowe;

class MySort {
    public void setNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.floor(Math.random() * 100);
        }
        System.out.println("Liczby nieposortowane to: ");
        for (int n : numbers) {
            System.out.print(n + ",");
        }
    }

    public void sortTable(int[] tab) {
        int x;
        for (int i = 0; i <= tab.length; i++) {
            for (int j = tab.length - 1; j >= 1; --j) {
                if (tab[j - 1] > tab[j]) {
                    x = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = x;
                }
            }
        }
    }

    public void printTableAfterSort(int [] tab){
        System.out.println("\n\nLiczby posortowane to: ");
        for (int t : tab) {
            System.out.print(t + ",");
        }
    }
}

public class Zadanie05k4 {
    public static void main(String[] args) {
        /*Napisz program, który zgodnie z zasadami programowania obiektowego, sortuje n liczb.
        W programie przyjmij 6 liczb. Klasa powinna zawierać 3 metody, czytaj, przetwórz oraz wyświetl.
         */
        int size = 20;
        int[] tab = new int[size];
        MySort s1 = new MySort();
        s1.setNumbers(tab);
        s1.sortTable(tab);
        s1.printTableAfterSort(tab);

    }
}
