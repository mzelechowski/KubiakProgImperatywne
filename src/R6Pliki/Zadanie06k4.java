package R6Pliki;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class File1 {
    double tablica[] = {10.1, 3.5, 89.7, 60.28, 100.12, 0.01};
    double d;

    public void writeToFile() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("pomiary.dat", "rw");
        for (int i = 0; i < tablica.length; i++)
            raf.writeDouble(tablica[i]);
        raf.close();
    }

    public void readFromFile() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("pomiary.dat", "r");
        for (int i = 0; i < tablica.length; i++) {
            raf.seek(8 * i);
            d = raf.readDouble();
            System.out.println(d);
        }
        raf.close();
    }
}

public class Zadanie06k4 {
    public static void main(String[] args) throws IOException {
        File1 plik= new File1();
        System.out.println("Program wyświetla co drugi pomiar zapisany wcześniej w pliku");
        plik.writeToFile();
        plik.readFromFile();
    }
}
