package R6Pliki;

import java.io.*;
import java.util.ArrayList;

class Matrix3b {
    private int n = 10;
    private int[][] a = new int[n][n];
    private int[][] b = new int[n][n];
    private int[][] c = new int[n][n];

    private String fileName = "dane6k3Buf.txt";

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
        String outLine;
        System.out.println("\nZapisujemy dane do pliku dane.txt");
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < n; i++) {
            outLine = "";
            for (int j = 0; j < n; j++) {
                if (j <= b[i].length)
                    outLine = outLine + b[i][j] + " ";
                else
                    outLine = outLine + b[i][j];
            }
            bw.write(outLine);
            bw.newLine();
        }
        bw.close();
    }

    public void readDataFromFile() throws IOException {
        String inLine = "";
        String [] tab;
        System.out.println("\nOdczytujemy dane z plikureadDataFromFile  by readline");
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> lista = new ArrayList<>();
        while ((inLine = br.readLine()) != null) {
            lista.add(inLine);
        }
             for (int i = 0; i < n; i++) {
                 tab=lista.get(i).split(" ");
                for (int j = 0; j < n; j++) {
                    c[i][j] =Integer.parseInt(tab[j]);
                    System.out.print(c[i][j]+ " ");
                }
                 System.out.println();
            }
        System.out.println("koniec wydruku z readDataFromFile");
        br.close();
    }

}

public class Zadanie06k3Buf {
    public static void main(String[] args) throws IOException {
        Matrix3b matrix3b = new Matrix3b();
        matrix3b.createData();
        matrix3b.transposition();
        matrix3b.saveDataToFile();
        matrix3b.readDataFromFile();
    }
}
