package ThreadImpl;

import ThreadImpl.TestLinkedBlockingQueuePool.MyThread;

/**
 * Created by liudap on 2018/2/26.
 */
public class StopThread {


    public static void main(String[] args) {

        MyThread thread1 = new MyThread(1);
        Thread thread = new  Thread(thread1);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }


    static class MyThread implements Runnable{

        int i = 0;
        public MyThread(int i){
            this.i = i;
        }

        public void run() {
            for (int j = 0; j < 5; j++) {
                System.out.println(i);

            }


        }
    }

}
