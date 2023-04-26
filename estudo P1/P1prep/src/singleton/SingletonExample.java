package P1prep.src.singleton;

public final class SingletonExample {
    private static final SingletonExample INSTANCE = new SingletonExample("nome");
    private String name;
    public SingletonExample(String nome)
    {
        this.name = nome;
    }

    public static SingletonExample getINSTANCE() {
        return INSTANCE;
    }

    public String getName() {
        return this.name;
    }
}
