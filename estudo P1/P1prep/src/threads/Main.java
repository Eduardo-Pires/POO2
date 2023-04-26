package untitled.src.threads;

public class Main {
    public static void main(String[] args) {
        ThreadCLS thread1 = new ThreadCLS("1", 123);
        ThreadCLS thread2 = new ThreadCLS("2", 125);
        ThreadCLS thread3 = new ThreadCLS("3", 54);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        try
        {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("atumalaca");

    }
}