package R7Watki;

class MyThread2 implements Runnable {
    private int licznik;
    private String nameThread;

    public MyThread2(String nameThread) {
        licznik = 0;
        this.nameThread = nameThread;
    }

    @Override
    public void run() {
        System.out.println("Wątek:  " + nameThread + "startuje.");
        try {
            do {
                Thread.sleep(500);
                System.out.println(nameThread + " licznik: " + licznik);
                licznik++;
            } while (licznik < 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Zadanie07k2 {
    public static void main(String[] args) {
        MyThread2 mt2= new MyThread2("Watek 1");
        Thread thread = new Thread(mt2);
        thread.start();


    }
}
