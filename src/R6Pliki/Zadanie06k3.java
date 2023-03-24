package R6Pliki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Matrix3 {
    private int n = 10;
    private int[][] a = new int[n][n];
    private int[][] b = new int[n][n];
    private int[][] c = new int[n][n];

    private String fileName = "dane6k3.txt";

    public void createData() {
        System.out.println("Tworzę macierz z pionową kolumną jedynek");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 1)
                    a[i][j] = 1;
                else
                    a[i][j] = 0;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void transposition() {
        System.out.println("\nTranspozycja danych");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void saveDataToFile() throws IOException {
        System.out.println("\nZapisujemy dane do pliku dane.txt");
        FileWriter fw = new FileWriter(fileName);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                fw.write((char) (b[i][j]));
            }
        }
        fw.close();
    }

    public void readDataFromFile() throws IOException {
        System.out.println("\nOdczytujemy dane z pliku");
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j]=(int) br.read();
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
        fr.close();
    }
}

public class Zadanie06k3 {
    public static void main(String[] args) throws IOException {
        /*Napisz program zgodnie z zasadami programowania obiektowego, który
        tablice o wymiarach 10x10 z 2 wierszem wypełnionym cyfrą 1, przekształca do tablicy 10x10
        z 2 kolumną wypełnioną cyfrą 1 i zapisuje ją do pliku tekstowego o nazwie dane6k3.txt, a
        następnie odczytuje ją z tego pliku i wyśiewtla na ekranie. Klasa powinna zawierać cztery
        metody:
        czytaj dane() - tworzy tablicę o wymiarach 10x10
        przetwórz dane() - przepisuje tablicę o wymiarach 10x10 do tablicy o wyiarach 10x10
        zapiszdanedoPliku() - zapisuje tablicę b o wymiarach 10x10 do pliku
        czytaj dane z pliku()
         */
        Matrix3 matrix3 = new Matrix3();
        matrix3.createData();
        matrix3.transposition();
        matrix3.saveDataToFile();
        matrix3.readDataFromFile();
    }
}
