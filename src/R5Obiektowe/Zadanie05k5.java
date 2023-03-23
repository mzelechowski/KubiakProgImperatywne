package R5Obiektowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Person {
    private String surname;
    private String name;
    private String street;
    private String postcode;
    private String city;

    public Person() {
    }

    public Person(String surname, String name, String street, String postcode, String city) {
        this.surname = surname;
        this.name = name;
        this.street = street;
        this.postcode = postcode;
        this.city = city;
    }

    public void initiate() {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Podaj dane pracownika: ");
            System.out.println("Podaj nazwisko: ");
            surname = buf.readLine();
            System.out.println("Podaj imie: ");
            name = buf.readLine();
            System.out.println("Podaj ulice");
            street = buf.readLine();
            System.out.println("Podaj kod pocztowy");
            postcode = buf.readLine();
            System.out.println("Podaj miasto");
            city = buf.readLine();
            System.out.println();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Nazwisko: " + surname);
        System.out.println("Imie: " + name);
        System.out.println("Ulicza: " + street);
        System.out.println("Kod pocztowy: " + postcode);
        System.out.println("Miasto: " + city);
    }
}

public class Zadanie05k5 {
    public static void main(String[] args){
        /*Napisz program, w którym zdefiniowano klasę osoba, zawierającą następujace pola:
        nazwisko, imie, kod, miasto oraz dwie metody.
        inicjalizuj oraz drukuj
         */
        Person worker = new Person();
        Person worker1 = new Person("Suchecki", "Arkadiusz", "Woronicza", "05092", "Warszawa");
        worker.initiate();
        worker.print();
        worker1.print();
    }
}
