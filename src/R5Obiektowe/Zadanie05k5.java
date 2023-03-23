package R5Obiektowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

class Person{
    private String surname;
    private String name;
    private String street;
    private String postcode;
    private String city;

    public Person(){
    }

    public Person(String surname, String name, String street, String postcode, String city) {
        this.surname = surname;
        this.name = name;
        this.street = street;
        this.postcode = postcode;
        this.city = city;
    }

    public void inicjuj() throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj dane pracownika: ");
        System.out.println("Podaj nazwisko: ");
        surname=buf.readLine();
        System.out.println("Podaj imie: ");
        name=buf.readLine();
        System.out.println("Podaj ulice");
        street=buf.readLine();
        System.out.println("Podaj kod pocztowy");
        postcode=buf.readLine();
        System.out.println("Podaj miasto");
        city=buf.readLine();
        System.out.println();
    }

    public void print() {
        System.out.println( "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                '}');
    }
}

public class Zadanie05k5 {
    public static void main(String[] args)  throws IOException {
        /*Napisz program, w którym zdefiniowano klasę osoba, zawierającą następujace pola:
        nazwisko, imie, kod, miasto oraz dwie metody.
        inicjalizuj oraz drukuj
         */
        Person worker = new Person();
        Person worker1=new Person("Suchecki", "Arkadiusz", "Woronicza", "05092", "Warszawa");
        worker.inicjuj();
        worker.print();
        worker1.print();
    }
}
