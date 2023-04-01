package R8Generyczne;



public class Zadanie08k2 {
    public static void main(String[] args) {
        /*Zadanie8.1 zmodyfikuja tak aby do stosu doać 4 liczby typy Integer i zdjąć dwa elemetny tego typu
         */
        StosGeneryczny<Integer> stos = new StosGeneryczny<>();
        stos.dodajDoStosu(4556);
        stos.dodajDoStosu(23423);
        stos.dodajDoStosu(323324);
        stos.dodajDoStosu(4434543);
        System.out.println(stos);
        System.out.println(stos.rozmiarStosu());
        stos.zdejmijZeStosu();
        stos.zdejmijZeStosu();
        System.out.println(stos);
        System.out.println(stos.rozmiarStosu());
    }
}
