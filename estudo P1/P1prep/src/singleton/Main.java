package P1prep.src.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample singleLadies = SingletonExample.getINSTANCE();
        System.out.println(singleLadies.getName());
    }
}
