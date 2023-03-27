package R7Watki;

class MyThread9 implements Runnable {
    Thread wtk;
    volatile boolean zawieszony;
    volatile boolean zatrzymany;

    MyThread9(String nazwa) {
        wtk = new Thread(this, nazwa);
        zawieszony = false;
        zatrzymany = false;
        wtk.start();
    }

    @Override
    public void run() {
        System.out.println(wtk.getName() + " startuje.");
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized (this) {
                    while (zawieszony) {
                        wait();
                    }
                    if (zatrzymany) break;
                    ;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(wtk.getName() + " został przerwany.");
        }
        System.out.println(wtk.getName() + " się zakończył.");
    }

    synchronized void moj_zatrzymany() {
        zatrzymany = true;
        zawieszony = false;
        notify();
    }

    synchronized void moj_zawieszony() {
        zawieszony = true;
    }

    synchronized void moj_wznowiony() {
        zawieszony = false;
        notify();
    }
}

public class Zadanie07k9 {
    public static void main(String[] args) {
        /*Napisz program, który korzystając własnych metod, zarządza wątkami tzn zawiesza,
        wznawia oraz je zatrzymuje
         */
        MyThread9 ob1 = new MyThread9("Moj watek");
        try {
            Thread.sleep(1000);

            ob1.moj_zawieszony();
            System.out.println("Zawieszenie watku");
            Thread.sleep(1000);

            ob1.moj_wznowiony();
            System.out.println("Wznowienie watku");
            Thread.sleep(1000);

            ob1.moj_zawieszony();
            System.out.println("Zawieszenie watku");
            Thread.sleep(1000);

            ob1.moj_wznowiony();
            System.out.println("Wznowienie watku");
            Thread.sleep(1000);

            ob1.moj_zawieszony();
            System.out.println("Zatrzymanie watku");
            ob1.moj_zatrzymany();
        } catch (InterruptedException exc) {
            System.out.println("Watek glowny został przerwany");
        }

        try {
            ob1.wtk.join();
        } catch (InterruptedException exc) {
            System.out.println("Główny watek został przerwany.");
        }
        System.out.println("Glowny watek zakończył się.");
    }
}
