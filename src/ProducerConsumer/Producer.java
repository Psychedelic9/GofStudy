package ProducerConsumer;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {
    private LinkedBlockingQueue<Produce> queue;
    private int maxSize;
    private String name;
    private AtomicInteger num;

    public Producer(LinkedBlockingQueue<Produce> queue, int maxSize, String name,AtomicInteger num) {
        this.num = num;
        this.queue = queue;
        this.maxSize = maxSize;
        this.name = name;
    }


    @Override
    public void run() {
        while (true){
            try {

                queue.put(new Produce(num.get(),"produce"));
                System.out.println("put new product "+num.get());
                num.incrementAndGet();
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (num.get()==1000){
                System.out.println("干完下班");
                break;
            }
        }
    }
}
