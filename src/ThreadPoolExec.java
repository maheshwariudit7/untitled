import java.util.concurrent.*;

public class ThreadPoolExec {

    public static void main(String[] args) {

        Callable<String> callable=  new Callable<>() {
            @Override
            public String call() throws Exception {
                return "hello world";
            }
        };
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.MILLISECONDS,
//                new LinkedBlockingDeque<>());

        ThreadPoolExecutor schedExecutor = new ScheduledThreadPoolExecutor(1);

//        Future<String> future = executor.submit(callable);
        /*try {
            if (!future.isDone()) {
                String res = future.get();
                System.out.println(res);
            }
        }catch (ExecutionException | InterruptedException e){
            e.printStackTrace();
        }*/

    }

}
