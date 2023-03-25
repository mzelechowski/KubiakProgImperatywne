package R7Watki;

class MyThread4 implements Runnable {
    public int licznik;
    public Thread watek;

    public MyThread4(String name) {
        watek = new Thread(this, name);
        licznik = 0;
        watek.start();
    }

    @Override
    public void run() {
        System.out.println("Watek: " + watek.getName() + " startuje");
        try {
            do {
                Thread.sleep(500);
                System.out.println(watek.getName() + ", licznik: " + licznik);
                licznik++;
            } while (licznik < 10);
        } catch (InterruptedException e) {
            System.out.println(watek.getName() + " watek przerwany");
        }
        System.out.println(watek.getName() + " zakonczony");
    }
}

public class Zadanie07k4 {
    public static void main(String[] args) {
        /*Napsiz wątek, który korzysta z zadania Zadanie07k3 i metody
        join(), aby upewnić się, że główny wątek, jest ostatnim wątkiem, który się zakończy.
         */
        System.out.println("Moj watek startuje.");
        MyThread4 mw1 = new MyThread4("Watek 1");
        MyThread4 mw2 = new MyThread4("Watek 2");
        MyThread4 mw3 = new MyThread4("Watek 3");

            try {
                mw1.watek.join();
                System.out.println("Watek 1 dołaczył");
                mw2.watek.join();
                System.out.println("Watek 2 dołaczył");
                mw3.watek.join();
                System.out.println("Watek 3 dołaczył");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Glowny watek został zakonczony");
    }
}
