package ConnPool;

/**
 * 1.可以看到，此时线程执行的同步块为synchronized(obj)，即只获得了obj的monitir

 2.notify()是调用TestNotify的方法，当前线程并未达到拥有TestNotify对象monitor的三个条件之一

 3.所以抛出java.lang.IllegalMonitorStateException
 wait()方法也和notify()一样有相同的限制：
 * Created by liudap on 2018/2/26.
 */
public class TestNotify implements Runnable {

    private final Object obj = new Object();


    public void run() {
        synchronized (obj) {
            new TestNotify().notify();
//            obj.notify();
        }
    }

    public static void main(String[] args) {
        //ShareVars shareVars = new ShareVars();
        new Thread(new TestNotify ()).start();
    }

}
