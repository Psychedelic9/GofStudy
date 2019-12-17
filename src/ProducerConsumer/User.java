package ProducerConsumer;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class User {
    private static final int maxSize = 10;
    private static AtomicInteger num = new AtomicInteger(0);

    public static void main(String[] args) {
        LinkedBlockingQueue queue = new LinkedBlockingQueue<Produce>(maxSize);
        Thread producer1 = new Thread(new Producer(queue,maxSize,"producer1",num));
        Thread producer2 = new Thread(new Producer(queue,maxSize,"producer2",num));

        Thread producer3 = new Thread(new Producer(queue,maxSize,"producer3",num));
        Thread consumer1 = new Thread(new Consumer(queue,"consumer1",maxSize));
        Thread consumer2 = new Thread(new Consumer(queue,"consumer2",maxSize));

        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.start();
        consumer2.start();

    }
}
