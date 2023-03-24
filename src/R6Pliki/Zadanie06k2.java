package R6Pliki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Matrix {
    private String nazwaPliku = "matrixData.txt";

    public void readData(int[][] tab, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j)
                    tab[i][j] = 1;
                else
                    tab[i][j] = 0;
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void saveDataToFile(int[][] tab, int size) throws IOException {
        System.out.println("Zapisujemy dane do pliku dane.txt");
        FileWriter fw = new FileWriter(nazwaPliku);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                fw.write((char) (tab[i][j]));
                //System.out.println(tab[i][j]);
            }
        }
        fw.close();
    }

    public void readDataFormFile(int[][] tab1, int size) throws IOException {
        System.out.println();
        System.out.println("Odczytujemy tablicę 10x10 z pliku.");
        FileReader fr = new FileReader(nazwaPliku);
        BufferedReader br = new BufferedReader(fr);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tab1[i][j]=(int) br.read();
                System.out.print(tab1[i][j]+" ");
            }
            System.out.println();
        }
        fr.close();

    }
}

public class Zadanie06k2 {
    public static void main(String[] args) throws IOException {
        /* napisz zgodnie z zasadami programowania obiektowego program, który tablicę 10x10 o postacji
        zapisuje do pliku teksowego dane.txt, a następnie odczytuje z niego zapisane dane i wyświetla
        ja na ekranie komputera. KLasa powinna zawierać trzy metody z parametrami
        czytajaDane (int tablica[][], int rozmiar) tworzy tablice 10x10
        zpiasza dane do pliku(int tablica[][], int rozmiar) - zapisuej 10x10 do pliku o nazwie dane txt.
        czytajdanezpliku(int tablica[][], int rozmiar) - odczytuje dane z pliku i wyswietla na ekranie
         */
        int size = 10;
        int[][] tab = new int[10][10];
        int[][] tab1 = new int[10][10];
        Matrix matrix = new Matrix();
        matrix.readData(tab, size);
        matrix.saveDataToFile(tab, size);
        matrix.readDataFormFile(tab1,size);

    }
}
