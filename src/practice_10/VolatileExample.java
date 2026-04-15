package practice_10;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileExample {
    static volatile boolean stop = false;
    static int count = 0;
    static void process() {
        while (!stop) {
            count++;
        }
        System.out.println("Поток остановлен!");
    }
    static void stop() {
        stop = true;
    }

    static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(VolatileExample::process);
        Thread thread2 = new Thread(VolatileExample::stop);

        thread1.start();
        Thread.sleep(2000);
        thread2.start();
    }
}
