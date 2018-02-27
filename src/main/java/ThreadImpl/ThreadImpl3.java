package ThreadImpl;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用CountDownLatch  等待其他线程执行完
 * Created by liudap on 2018/2/26.
 */
public class ThreadImpl3 {



    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(5);
        try {
        for (int i = 0; i < 5; i++) {
            Future<Integer> future =  executorService.submit(new Thread2(i,countDownLatch));
            System.out.println("------------");
//            System.out.println(future.get());
        }
            countDownLatch.await();
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
        CountDownLatch countDownLatch;
//        CyclicBarrier cyclicBarrier;
        public Thread2(int num, CountDownLatch countDownLatch){
            this.num = num;
            this.countDownLatch = countDownLatch;
        }

        public Integer call() throws Exception {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());

            if(num == 3){
                System.out.println(Thread.currentThread().getName() + "sleep 5s");
                Thread.sleep(5000);

            }
            countDownLatch.countDown();
            System.out.println("///"+Thread.currentThread().getName());
            return num;
        }
    }

}
