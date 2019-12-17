package ProducerConsumer;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class Consumer implements Runnable {

    private LinkedBlockingQueue<Produce> queue;
    private String name;
    private int maxSize;

    public Consumer(LinkedBlockingQueue queue, String name, int maxSize) {
        this.queue = queue;
        this.name = name;
        this.maxSize = maxSize;
    }


    @Override
    public void run() {
        while (true){

            try {
                 Produce produce = queue.take();
                System.out.println("取出第"+produce.getNum()+"号产品");
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
