package R6Pliki;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;

class Matrix3a {
    private int n = 10;
    private int[][] a = new int[n][n];
    private int[][] b = new int[n][n];
    private int[][] c = new int[n][n];

    private String fileName = "dane6k3str.txt";

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
        // BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                fw.write(Integer.toString(b[i][j]));
            }
        }
        fw.close();
    }

    public void readDataFromFile() throws IOException {
        System.out.println("\nOdczytujemy dane z pliku");
        FileReader fr = new FileReader(fileName);
        //BufferedReader br = new BufferedReader(fr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //c[i][j]= Integer.parseInt(Character.toString(fr.read()));
                //c[i][j]=  (char) fr.read();
                c[i][j]=Character.getNumericValue(fr.read());
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
        fr.close();
    }
}

public class Zadanie06k3Str {
    public static void main(String[] args) throws IOException {
        Matrix3a matrix3a = new Matrix3a();
        matrix3a.createData();
        matrix3a.transposition();
        matrix3a.saveDataToFile();
        matrix3a.readDataFromFile();
    }
}
