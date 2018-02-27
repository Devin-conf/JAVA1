package Future;

import java.util.concurrent.Callable;

/**
 * Created by liudap on 2018/2/8.
 */
public class CallableDemo  implements Callable{


    private int sum;



    public Integer call() throws Exception {
        System.out.println("callabel 子线程开始计算");
        Thread.sleep(5000);
        for (int i = 0; i < 5000; i++) {
            sum = sum + 1;
        }
        System.out.println("over");
        return sum;
    }
}
