package sync;

/**
 * Created by liudap on 2018/1/26.
 */
public class Thread2 implements Runnable{

    private SynchronizedTest getS1;


    public Thread2(SynchronizedTest s1){
    this.getS1 = s1;
    }

    public void run() {
//      SynchronizedTest s =  new SynchronizedTest();
//      s.method1();
//      SynchronizedTest s1 = new SynchronizedTest();
        getS1.staticMethod2();
        System.out.println("------------");



//        SynchronizedTest.staticIn.method1();

//      SynchronizedTest.staticMethod1();
//      SynchronizedTest.staticMethod2();
    }



}
