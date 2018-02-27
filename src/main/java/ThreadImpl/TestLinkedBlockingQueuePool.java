package ThreadImpl;

import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池 用到队列是 LinkedBlockingQueue
 * Created by liudap on 2018/2/26.
 */
public class TestLinkedBlockingQueuePool {




    public static void main(String[] args) {

        ExecutorService executorService = new ThreadPoolExecutor(2, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(1));

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();
//        executorService.execute(t1);
//        executorService.execute(t2);
//        executorService.execute(t3);
//        executorService.execute(t4);
//        executorService.execute(t5);

        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
        executorService.submit(t4);
        executorService.submit(t5);

        executorService.shutdown();

    }


    static class MyThread implements Runnable{

        public void run() {
            System.out.println(Thread.currentThread().getName() + " 正在执行。。。");

        }
    }
}
