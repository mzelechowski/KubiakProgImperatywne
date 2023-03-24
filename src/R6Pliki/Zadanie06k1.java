package R6Pliki;

import java.io.*;

class Pliczek{
    private String dataToFile, dataFromFile;
    private static String nazwaPliku="dane.txt";

    public void czytajDane()throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj imię i nazwisko: ");
        dataToFile = buf.readLine();
    }

    public void zapiszDaneDoPliku() throws IOException{
        System.out.println("Zapisujemy dane do pliku dane.txt");
        FileWriter fw = new FileWriter(nazwaPliku);
        fw.write(dataToFile);
        fw.close();
    }

    public void czytajdaneZPliku() throws IOException {
        System.out.println("Odczytujemy dane z pliku: "+nazwaPliku);
        System.out.println("");
        FileReader fr = new FileReader(nazwaPliku);
        BufferedReader br = new BufferedReader(fr);
        while((dataFromFile=br.readLine())!=null){
            System.out.println(dataFromFile);
        }
    }
}

public class Zadanie06k1 {
    public static void main(String[] args) throws IOException {
  /* Napisz zadanie, które z zasadami programowania obietkowego wcztyuje dane z klawiatury imię i naziwsko,
     zapisuje te dane do pliku tekstowego dane.txt, a następnie je z tego pliku odczytuje i wyświtela na keranie.
     Klasa powinna zawierać trzy metody: czytajDane(), zapiszdanedoPliku() - metoda zapisuje imię i nazwisko
     do pliku tekstowego
     czytajdanePliku() - metoda odczytuje dane z pliku dane.txt i wyświetla na ekranie komputera
   */
        Pliczek pliczek = new Pliczek();
        pliczek.czytajDane();
        pliczek.zapiszDaneDoPliku();
        pliczek.czytajdaneZPliku();
    }
}
