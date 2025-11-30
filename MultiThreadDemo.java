// Creating Thread using Thread class
class ThreadExample extends Thread {
    private String name;

    ThreadExample(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " (Thread Class) - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Creating Thread using Runnable interface
class RunnableExample implements Runnable {
    private String name;

    RunnableExample(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " (Runnable) - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {

        // Thread using Thread class
        ThreadExample t1 = new ThreadExample("Thread-1");
        ThreadExample t2 = new ThreadExample("Thread-2");

        // Thread using Runnable interface
        RunnableExample r1 = new RunnableExample("Runnable-1");
        RunnableExample r2 = new RunnableExample("Runnable-2");

        Thread tr1 = new Thread(r1);
        Thread tr2 = new Thread(r2);

        // Start all threads
        t1.start();
        t2.start();
        tr1.start();
        tr2.start();
    }
}
