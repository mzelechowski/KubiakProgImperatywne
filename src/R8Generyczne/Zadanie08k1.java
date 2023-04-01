package R8Generyczne;
import java.util.ArrayList;

class StosGeneryczny<E> {
    ArrayList<E> list = new ArrayList<>();

    public int rozmiarStosu() {
        return this.list.size();
    }

    public void dodajDoStosu(E object) {
        this.list.add(object);
    }

    public E zdejmijZeStosu() {
        return this.list.remove(list.size() - 1);
    }

    @Override
    public String toString() {
        return "StosGeneryczny{" +
                "list=" + list +
                '}';
    }
}

public class Zadanie08k1 {
    public static void main(String[] args) {
        /**Napisz program, który tworząc klasę generyczną o nazwie StosGeneryczny<E>
         * klasa zaweira następujące metody rozmiarStosu(), dodaj do stosu(), zedjmijze stosu()
         */
        StosGeneryczny<String> stos = new StosGeneryczny<>();
        stos.dodajDoStosu("Java");
        stos.dodajDoStosu("JDBC");
        stos.dodajDoStosu("Hibernate");
        stos.dodajDoStosu("MAVEN");
        System.out.println(stos);
        System.out.println(stos.rozmiarStosu());
        System.out.println(stos.zdejmijZeStosu());
        System.out.println(stos.rozmiarStosu());
        System.out.println(stos);
    }
}