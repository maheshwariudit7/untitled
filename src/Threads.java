public class Threads extends Thread{

    @Override
    public void run() {
        System.out.println("Running from Thread class");
    }

    public static void main(String[] args) {

        Threads t = new Threads();
        t.start();
    }
}

class ThreadsRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Frm Runnable impl class");
    }

    public static void main(String[] args) {

        ThreadsRunnable tr1 = new ThreadsRunnable();
        Thread t1 = new Thread(tr1);
        t1.start();
    }
}
