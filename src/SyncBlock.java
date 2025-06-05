public class SyncBlock {

    int count;

    public void increment(){
        synchronized (this){
            count++;
        }
    }

    public int getCount(){
        return count;
    }
    public static void main(String[] args) throws InterruptedException {

        SyncBlock s = new SyncBlock();

        Thread t1 =new Thread(()->{
           for(int i=0;i<1000;i++){
                s.increment();
           }
        });

        Thread t2 =new Thread(()->{
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
