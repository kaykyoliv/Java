package test;
class ThreadExample extends Thread{
    private final char c;
    public ThreadExample(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable {
    private final char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsTest01 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExampleRunnable('a'));
        Thread t2 = new Thread(new ThreadExampleRunnable('b'));
        Thread t3 = new Thread(new ThreadExampleRunnable('c'));
        Thread t4 = new Thread(new ThreadExampleRunnable('d'));

        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("############################# "+Thread.currentThread().getName());
    }

}
