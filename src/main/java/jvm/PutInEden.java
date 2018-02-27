package jvm;

import java.util.concurrent.Executor;

/**
 * 使用 JVM 参数-XX:+PrintGCDetails -Xmx20M -Xms20M 运行清单 1 所示代码，输出如清单 2 所示。
 * Created by liudap on 2018/2/26.
 */
public class PutInEden {
    public static void main(String[] args){
        byte[] b1,b2,b3,b4;//定义变量
        b1=new byte[1024*1024];//分配 1MB 堆空间，考察堆空间的使用情况
        b2=new byte[1024*1024];
        b3=new byte[1024*1024];
        b4=new byte[1024*1024];

        PutInEden p = new PutInEden();
       String sr =  p.returnstr();
    }


    public String returnstr(){


        try{
            return "Aa";
        }catch (Exception e) {

        }
        finally {
            System.out.println("11111");
        }

    return "fff";
    }
}
