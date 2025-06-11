package Java8;

public class Deadlock {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 acquired lock 1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock2){
                    System.out.println("Thread 1 acquired lock2 ");
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (lock2){
                System.out.println("Thread 2 acquired lock 2");

                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("Thread 2 acquired lock1");
                }
            }
        });

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }

}
