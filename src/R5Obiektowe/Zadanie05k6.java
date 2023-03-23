package R5Obiektowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Management extends Person {
    private String education;
    private String jobPosition;

    public Management() {
    }
    public Management(String surname, String name, String street, String postcode, String city, String education, String jobPosition){
        super(surname, name, street, postcode, city);
        this.education=education;
        this.jobPosition=jobPosition;
    }

    public void initiate1() {
        initiate();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Podaj wykształcenie: ");
            education = buf.readLine();
            System.out.println("Podaj stanowisko pracy: ");
            jobPosition = buf.readLine();
            System.out.println();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void print1() {
        print();
        System.out.println("Wykształcenie: " + education);
        System.out.println("Stanowisko: " + jobPosition);
    }
}

public class Zadanie05k6 {
    public static void main(String[] args) {
        Management man1 = new Management();
        Management man2 = new Management("Zelechowski", "Maciej", "Malarska", "05092"
                , "Lomianki", "Politechnika","inzynier");
        man1.initiate1();
        man1.print1();
        man2.print1();
    }
}
