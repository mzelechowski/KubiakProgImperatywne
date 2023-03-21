package R3Iteracje;

public class Zadanie03k2 {
    public static void main(String[] args) {
        /*Napisz pogram który za pomocą instrukcji do while() oblicza iteracyjnie równanei y=3*x*/
        int i=0;
        do{
            System.out.println("Równanie y=3*x dla x=" +i+" wynosi: "+i*3);
            i++;
        } while(i<=10);
    }
}
