package ThreadImpl;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用CyclicBarrier 让线程池里面的线程 同时等待一个时间点
 * Created by liudap on 2018/2/26.
 */
public class ThreadImpl2 {



    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        CountDownLatch countDownLatch = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
        try {
        for (int i = 0; i < 5; i++) {
            Future<Integer> future =  executorService.submit(new Thread2(i,cyclicBarrier));
            System.out.println("------------");
//            System.out.println(future.get());
        }
//            countDownLatch.await();
            System.out.println("执行完毕");

//        } catch (InterruptedException e) {
//            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    static class Thread2 implements Callable<Integer>{

        int num = 0;
//        CountDownLatch countDownLatch;
        CyclicBarrier cyclicBarrier;
        public Thread2(int num, CyclicBarrier cyclicBarrier){
            this.num = num;
            this.cyclicBarrier = cyclicBarrier;
        }

        public Integer call() throws Exception {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());

            if(num == 3){
                System.out.println("sleep 5s");
                Thread.sleep(5000);

            }
            cyclicBarrier.await();
            System.out.println("///"+Thread.currentThread().getName());
            return num;
        }
    }

}
