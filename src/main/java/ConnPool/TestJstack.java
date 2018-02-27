package ConnPool;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by liudap on 2018/2/26.
 */
public class TestJstack {


    public static Executor executor = Executors.newFixedThreadPool(5);

    public static Object lock = new Object();

    public static void main(String[] args) {
        Task task = new Task();
        Task task2 = new Task();
        executor.execute(task);
        executor.execute(task2);

    }


    static class Task implements Runnable{

        public void run() {
            try {
                count();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void count() throws InterruptedException {
            while(true){
                int i = 0;
                i++;
                System.out.println(Thread.currentThread().getName() +" " + i);
                Thread.sleep(1000);

            }
        }
    }




}
