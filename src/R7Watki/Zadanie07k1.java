package R7Watki;
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Prosty program, który tworzy watek");
    }
}

public class Zadanie07k1 {
    public static void main(String[] args) {
        Thread newThread = new MyThread();
        newThread.start();
    }
}
