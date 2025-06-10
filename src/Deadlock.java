public class Deadlock {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            synchronized (lock1){
                System.out.println("Thread 1 : locked lock1");
                try {
                    Thread.sleep(100);
                    ;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    System.out.println("Thread 1:locked lock2");
                }
            }
        });

        Thread t2 = new Thread(()->{

            synchronized (lock2 ) {
                System.out.println("Thread 2:locked lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("Thread 2 :locked lock1");
                }
            }
        });

        t1.start();
        t2.start();
/*
        t1.join();
        t2.join();*/
    }
}
