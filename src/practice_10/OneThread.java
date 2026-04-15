package practice_10;

public class OneThread extends Thread {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Привет из потока!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    static void main(String[] args) {
        OneThread thread = new OneThread();
        thread.start();
    }
}
