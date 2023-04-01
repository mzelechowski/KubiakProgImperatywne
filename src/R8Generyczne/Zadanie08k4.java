package R8Generyczne;

class Generic {
    public static <E extends Comparable<E>> void sortArray(E[] array) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < array.length - 1; i++) {
            // Find the maximum in the list[0..i]
            currentMin = array[i];
            currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin.compareTo(array[j]) > 0) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }

    public static void printArray(Object[] array) {
        for (Object a : array)
            System.out.print(a + ", ");
        System.out.println();
    }
}

public class Zadanie08k4 {
    public static void main(String[] args) {
        /*Napisz progrma, który zawiera metodę generyczną do sortowania tablicy obietków typu Comparable
         */
        Integer[] intArray = {12, 6, 3};
        Double[] doubleArray = {3.14, 11.3, -12.1};
        Character[] charArray = {'c', 'z', 'a', '!'};
        String[] stringArray = {"Java", "JDBC", "Maven", "Git", "Apache"};

        Generic.printArray(intArray);
        Generic.printArray(doubleArray);
        Generic.printArray(charArray);
        Generic.printArray(stringArray);


        Generic.sortArray(intArray);
        Generic.sortArray(doubleArray);
        Generic.sortArray(charArray);
        Generic.sortArray(stringArray);

        System.out.println("\n Sorted arrays\n");

        Generic.printArray(intArray);
        Generic.printArray(doubleArray);
        Generic.printArray(charArray);
        Generic.printArray(stringArray);

    }
}
