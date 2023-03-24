package exercicio3;

public class Counting
{
    static int finalCounter;

    public static void incrementCounter(int counter)
    {
        finalCounter += counter;
    }

    public static int getFinalCounter() {
        return finalCounter;
    }
}
