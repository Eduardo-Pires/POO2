package P1prep.src.simpleFactory;

public class Main {
    public static void main(String[] args) {
        SystemUser cliente = UserFactory.create("Cliente");
        cliente.login();
    }
}
