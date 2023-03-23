package R5Obiektowe;

class Matrix {
    public void fillMatrix(double[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j)
                    matrix[i][j] = Math.random() * 10;
                else
                    matrix[i][j] = 0;
            }
        }
    }

    public void calcMatrix(double[][] matrix, int size) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }
        System.out.println("\nSuma elementów na przekątnej wynosi= " + (int) sum + ".");
    }

    public void printMatrix(double[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((int) matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Zadanie05k3 {
    public static void main(String[] args) {
        /*Napisz program, któy zgodnie z zasadami programowania obietkowego, w tablicy 10x10
        umieszcza losowo na przekątnej liczby od 0 do 9, a poza przekątną zera.
        Dodatkowo program oblicza sumę wzystkich liczb zanjdujących siąna przekątnej.
        Klasa powinna zwierać trzy metody z parametrami.
         */
        int size = 10;
        double[][] tab = new double[size][size];
        Matrix matrix1 = new Matrix();
        matrix1.fillMatrix(tab, size);
        matrix1.printMatrix(tab, size);
        matrix1.calcMatrix(tab, size);

    }
}
