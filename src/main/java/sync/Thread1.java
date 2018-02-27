package sync;

/**
 * Created by liudap on 2018/1/26.
 */
public class Thread1 implements Runnable{
    private SynchronizedTest getS1;


    public Thread1(SynchronizedTest s1){
        this.getS1 = s1;
    }


    public void run() {
      SynchronizedTest s =  new SynchronizedTest();
        getS1.clss();


//        SynchronizedTest.staticIn.method1();

//      SynchronizedTest.staticMethod1();
//      SynchronizedTest.staticMethod2();
    }
}
