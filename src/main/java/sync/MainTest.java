package sync;

/**
 * Created by liudap on 2018/1/28.
 */
public class MainTest {


    public static void main(String[] args) {
        SynchronizedTest s2 = new SynchronizedTest();

        SynchronizedTest s1 = new SynchronizedTest();
        Thread2 t2 = new Thread2(s1);
        Thread1 t1 = new Thread1(s2);
        new Thread(t2).start();
        new Thread(t1).start();
    }

}