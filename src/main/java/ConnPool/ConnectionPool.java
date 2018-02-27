package ConnPool;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * Created by liudap on 2017/12/6.
 */
public class ConnectionPool {

    private LinkedList<Connection> pool = new LinkedList<Connection>();

    public ConnectionPool(int initialSize){
        if(initialSize > 0) {
            for (int i = 0; i < initialSize; i++){
                pool.addLast(ConnectionDriver.createConnection());
            }
        }
    }

    public void releaseConnection(Connection con){
        if(con != null) {
            synchronized (pool){
                // 连接释放后需要进行通知，这样其他消费者能够感知到连接池中已经归还了一个连接
                pool.addLast(con);
                pool.notifyAll();
            }
        }
    }

    public Connection fetchConnection(long mills) throws InterruptedException {
        synchronized (pool) {
            if(mills <= 0) {
                System.out.println("mills " +mills);
                while (pool.isEmpty()) {
                    pool.wait();
                }
                return  pool.removeFirst();
            }
            else{
                long future = System.currentTimeMillis() + mills;
                long remaining = mills;
                while(pool.isEmpty() && remaining > 0) {
                    pool.wait(remaining);
                    remaining  = future - System.currentTimeMillis();
                }
                Connection result = null;
                if(!pool.isEmpty()) {
                    result = pool.removeFirst();
                }
                return result;
            }
        }
    }

}
