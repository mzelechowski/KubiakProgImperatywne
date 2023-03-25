package R7Watki;

class MyThread3 implements Runnable {
    public int licznik;
    private Thread watek;

    public MyThread3(String name) {
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

public class Zadanie07k3 {
    public static void main(String[] args) {
        System.out.println("Moj watek startuje.");
        MyThread3 mw1 = new MyThread3("Watek 1");
        MyThread3 mw2 = new MyThread3("Watek 2");
        MyThread3 mw3 = new MyThread3("Watek 3");
        do {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (mw1.licznik < 10 || mw2.licznik < 10 || mw3.licznik < 10);
        System.out.println("Glowny watek został zakonczony");
    }
}
