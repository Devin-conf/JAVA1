package sync;

/**
 * Created by liudap on 2018/1/26.
 */
public class SynchronizedTest {

    public static SynchronizedTest  staticIn  = new SynchronizedTest();


    static synchronized void clss(){
        for(int i = 0;i < 10;i++){
            System.out.println("static clss is running!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }



    public void sysThisMetohd(){
        synchronized (this){
            for(int i = 0;i < 10;i++){
                System.out.println("this running!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }


    public synchronized void method1(){
        for(int i = 0;i < 10;i++){
            System.out.println("method1 is running!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }



    public synchronized void method2(){                                   //非静态方法2
        for( int i = 0; i < 10 ; i++){
            System.out.println("method2 is running!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public synchronized static void staticMethod1(){                     //静态方法1
        for( int i = 0; i < 10 ; i++){
            System.out.println("static method1 is running!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public synchronized static void staticMethod2(){                      //静态方法2
        for( int i = 0; i < 10 ; i++){
            System.out.println("static method2 is running!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


}
