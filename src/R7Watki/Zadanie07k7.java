package R7Watki;

class SumArray7 {
    private int sum;

    int sumArray(int[] numbers) {
        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Current value sum for " + Thread.currentThread().getName() + " is " + sum + ".");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("The main thread has been interrupted.");
            }
        }
        return sum;
    }
}

class MyThread7 implements Runnable {
    Thread thr;
    static SumArray sa = new SumArray();
    int a[];
    int odp;

    public MyThread7(String name, int numbers[]) {
        thr = new Thread(this, name);
        thr.start();
        a = numbers;
    }

    @Override
    public void run() {
        System.out.println(thr.getName() + " startuje.");
        synchronized (sa) {
            odp = sa.sumArray(a);
        }
        System.out.println("Suma końcowa dla " + thr.getName() + " is " + odp + ".");
        System.out.println(thr.getName() + " został zakończony.");
    }
}

public class Zadanie07k7 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread6 mw1 = new MyThread6("Watek 1", a);
        MyThread6 mw2 = new MyThread6("Watek 2", a);
        try {
            mw1.thr.join();
            mw2.thr.join();
        } catch (InterruptedException exc) {
            System.out.println("The main thread has been interrupted.");
        }
    }
}
