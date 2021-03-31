package src.demo.thread;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class Source{

    private volatile boolean flag = true; // 默认开启，进行生产+消费
    private AtomicInteger atomicInteger = new AtomicInteger(); //生产

    BlockingQueue<String> blockingQueue = null;

    // 阻塞队列，不知道是哪个，进行构造注入，传哪个就是哪个
    public Source(BlockingQueue<String> blockingQueue){

        this.blockingQueue = blockingQueue;
        System.out.println(blockingQueue.getClass().getName());

    }

    public void prod() throws Exception{

        String data = null;
        boolean retValue;

        while (flag){

            data = atomicInteger.incrementAndGet() + ""; // i++ 原子版
            retValue = blockingQueue.offer(data,2L, TimeUnit.SECONDS);

            if (retValue){
                System.out.println(Thread.currentThread().getName() + "\t插入队列"+data+"成功");
            }else {
                System.out.println(Thread.currentThread().getName() + "\t插入队列"+data+"失败");
            }

            TimeUnit.SECONDS.sleep(2); //一秒生产一次

        }

        System.out.println(Thread.currentThread().getName() + "\t叫停了，生产结束，flag = false");

    }

    public void consumer() throws Exception{

        String result = null;

        while (flag){

            result =  blockingQueue.poll(5L,TimeUnit.SECONDS);//等待时间2秒
            if (null == result || result.equalsIgnoreCase("")){

                flag = false;
                System.out.println(Thread.currentThread().getName() + "\t超过两秒中消费退出");
                return;
            }
            System.out.println(Thread.currentThread().getName() + "\t消费队列"+result+"成功");

        }


    }

    public void stop(){
        this.flag = false;
    }

}





/*
*   生产者，消费者模式
*
* */
public class ProdConsumer {

    public static void main(String[] args) throws Exception{


        Source source = new Source(new ArrayBlockingQueue<>(10));

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t生产线程启动");
            try {
                source.prod();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"prod").start();


        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t消费线程启动");
            try {
                source.consumer();
                System.out.println();
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"consumer").start();

        TimeUnit.SECONDS.sleep(10);

        System.out.println();
        System.out.println();
        System.out.println("5s 时间到了 停止生产");
        source.stop();
    }
}
