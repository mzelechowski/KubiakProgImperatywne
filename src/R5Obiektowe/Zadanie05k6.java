package R5Obiektowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Management extends Person {
    private String education;
    private String jobPosiotion;

    public void initiate1() {
        initiate();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Podaj wykształcenie: ");
            education = buf.readLine();
            System.out.println("Podaj stanowisko pracy: ");
            jobPosiotion = buf.readLine();
            System.out.println();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void print1() {
        print();
        System.out.println("Wykształcenie: " + education);
        System.out.println("Stanowisko: " + jobPosiotion);
    }
}

public class Zadanie05k6 {
    public static void main(String[] args) {
        Management man1 = new Management();
        man1.initiate1();
        man1.print1();

    }
}
