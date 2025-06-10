public class Synchronization {

    int count;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) throws InterruptedException {

        Synchronization s = new Synchronization();

        Object o = s.getClass();

        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                s.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                s.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(s.getCount());


    }
}


