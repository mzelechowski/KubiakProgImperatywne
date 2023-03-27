package R7Watki;

class TikTak {
    synchronized void tik(boolean chodzi) {
        if (!chodzi) {
            notify();
            return;
        }
        System.out.println("Tik");
        notify();
        try {
            wait();
        } catch (InterruptedException exc) {
            System.out.println("Watek został przerwany");
        }
    }

    synchronized void tak(boolean chodzi) {
        if (!chodzi) {
            notify();
            return;
        }
        System.out.println("Tak");
        notify();
        try {
            wait();
        } catch (InterruptedException ec) {
            System.out.println("Watek został przerwany");
        }
    }
}

class MyThread8 implements Runnable {
    Thread wtk;
    TikTak tt0b;

    MyThread8(String nazwa, TikTak tt) {
        wtk = new Thread(this, nazwa);
        tt0b = tt;
        wtk.start();
    }

    @Override
    public void run() {
        if (wtk.getName().compareTo("Tik") == 0) {
            for (int i = 0; i < 5; i++)
                tt0b.tik(true);
            tt0b.tik(false);
        } else {
            for (int i = 0; i < 5; i++)
                tt0b.tak(true);
            tt0b.tak(false);
        }
    }
}

public class Zadanie07k8 {
    public static void main(String[] args) {
        TikTak tt = new TikTak();
        MyThread8 mw1 = new MyThread8("Tik", tt);
        MyThread8 mw2 = new MyThread8("Tak", tt);
        try
        {
            mw1.wtk.join();
            mw2.wtk.join();
        }catch (InterruptedException exc){
            System.out.println("Główny wątek został przerwany");
        }
    }
}
