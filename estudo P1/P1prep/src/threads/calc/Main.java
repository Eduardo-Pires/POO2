package calc;

public class Main {

    public static void main(String[] args) {
        int[] marimo = {0,1,2,2,3};
        ThreadSoma somi = new ThreadSoma("Roberto", marimo);
        int[] marima = {0,1,2,2,3,34};
        ThreadSoma somi1 = new ThreadSoma("Roberta", marima);
        int[] marime = {0,1,2,2,3,39};
        ThreadSoma somi2 = new ThreadSoma("Robert", marime);

    }
}
