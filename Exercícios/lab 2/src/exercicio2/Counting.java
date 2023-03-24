package exercicio2;

public class Counting
{
    static int finalCounter;

    public static synchronized void incrementCounter(int counter)
    {
        finalCounter += counter;
    }

    public static int getFinalCounter() {
        return finalCounter;
    }
}
