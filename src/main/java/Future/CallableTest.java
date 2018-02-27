package Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by liudap on 2018/2/8.
 */
public class CallableTest {


    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor()    ;
        //创建callable对象任务
        CallableDemo calTask = new CallableDemo();
        //提交任务并获取执行结果 这是方法1
        //Future<Integer> future = es.submit(calTask);

        FutureTask<Integer> future = new FutureTask<Integer>(calTask);
        es.submit(future);

        es.shutdown();
        try{
            System.out.println("主线程执行其他任务");
            if(future.get() != null){
                System.out.println("future get ---" + future.get());
            }
            else{
                System.out.println("没有获取结果");
            }

        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("主线程执行完毕");

    }

}
