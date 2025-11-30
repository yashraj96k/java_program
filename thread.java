class Message {
    private String content;
    private boolean available = false;

    public synchronized void produce(String msg) {
        while (available) { // Wait if previous message is not yet consumed
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        content = msg;
        available = true;
        System.out.println("Produced: " + msg);

        notify(); // Notify one waiting consumer
    }

    public synchronized void consume() {
        while (!available) { // Wait if no message is available
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + content);
        available = false;

        notifyAll(); // Notify producers/consumers
    }
}

class Producer extends Thread {
    private Message msg;

    Producer(Message m) {
        msg = m;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            msg.produce("Message " + i);
        }
    }
}

class Consumer extends Thread {
    private Message msg;

    Consumer(Message m) {
        msg = m;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            msg.consume();
        }
    }
}

public class thread {
    
    public static void main(String[] args) {
        Message m = new Message();
        Producer p = new Producer(m);
        Consumer c = new Consumer(m);

        p.start();
        c.start();
    }
}
