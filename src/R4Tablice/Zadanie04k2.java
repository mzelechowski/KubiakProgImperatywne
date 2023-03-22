package R4Tablice;

public class Zadanie04k2 {
    public static void main(String[] args) {
        int n=10;
        int array[] = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i]=array.length-i-1;
            System.out.println(array[i]);
        }
    }
}
