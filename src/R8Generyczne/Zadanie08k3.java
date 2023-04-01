package R8Generyczne;

class ArrayPrint {
    public static <E> void print(E[] array) {
        for (E a : array)
            System.out.print(a + ",");
        System.out.println();
    }
}


public class Zadanie08k3 {
    public static void main(String[] args) {
        /* napisz program, w któym zdefioniowano metodę gneryczną wyświetlającą tablic różnych elementów
         */
        Integer[] arrayInt={1,2,3,4,5,6};
        ArrayPrint.print(arrayInt);

        String[] arrayString={"maciek", "barte", "wojtek","dariusz"};
        ArrayPrint.print(arrayString);
    }
}
