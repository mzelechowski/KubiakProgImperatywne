package R7Watki;

class Priority implements Runnable {
    public int counter;
    public Thread thr;
    static boolean stop = false;
    static String current_name;

    public Priority(String name) {
        thr = new Thread(this, name);
        counter = 0;
        current_name = name;
    }

    @Override
    public void run() {
        System.out.println(thr.getName() + " startuje.");
        do {
            counter++;
            if (current_name != thr.getName()) {
                current_name = thr.getName();
                System.out.println(current_name);
            }
        } while (stop == false && counter < 10000);
        stop=true;
        System.out.println(thr.getName() + " zakonczono.");
    }
}

public class Zadanie07k5 {
    public static void main(String[] args) {
        /*Napisz program, który demonstruje działanie dwóch wątków o różnyc priorytetach*/
        Priority mw1 = new Priority("High Priority");
        Priority mw2 = new Priority("Normal Priority");
        //Priority mw3 = new Priority("Low Priority");

        mw1.thr.setPriority(Thread.MAX_PRIORITY);
        mw2.thr.setPriority(Thread.NORM_PRIORITY);
       // mw3.thr.setPriority(Thread.MAX_PRIORITY);

        mw1.thr.start();
        mw2.thr.start();
        //mw3.thr.start();

        try {
            mw1.thr.join();
            mw2.thr.join();
            //mw3.thr.join();
        } catch (InterruptedException e) {
            System.out.println("The main thread has been interrupted");
        }
        System.out.println("High priority thread: counter status = "+ mw1.counter+".");
        System.out.println("Normal priority thread: counter status = "+ mw2.counter+".");
        //System.out.println("Low priority thread: counter status = "+ mw3.counter+".");
    }
}
