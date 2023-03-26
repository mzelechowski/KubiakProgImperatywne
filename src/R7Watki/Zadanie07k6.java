package R7Watki;

class SumArray {
    private int sum;

    public synchronized int sumArray(int numbers[]) {
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
        odp = sa.sumArray(a);

        System.out.println("Suma końcowa dla " + thr.getName() + " is " + odp + ".");
        System.out.println(thr.getName() + " został zakończony.");
    }
}

public class Zadanie07k6 {
    public static void main(String[] args) {
        /*Napisz program, który ilusturej dostęp do metod poprzez, zmodyfikowanie ich
        za pomocą słowa kluczowego synchronized. Przyjmij, że program zawiera trzy klasy.
        Pierwsza z nich, SumArray zawiera metodę sumArray() sumujące wszystkie elementy zamieszczone w tablicy.
        Druga klasa mójWatek, używa obietku typu sumArray do uzyskania sumy elementów tablicy skłądających się
        z liczb całkowitych. Ostatnia klasa Main, tworzy dwa wątki, które obliczają sumę elementów zawartych
        w tablicy.
         */
        int a[] ={1,2,3,4,5};

        MyThread7 mw1 = new MyThread7("Watek 1", a);
        MyThread7 mw2 = new MyThread7("Watek 2", a);
    }
}
