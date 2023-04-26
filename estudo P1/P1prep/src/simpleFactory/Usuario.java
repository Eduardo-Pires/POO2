package P1prep.src.simpleFactory;

public class Usuario implements SystemUser{
    @Override
    public void login() {
        System.out.println("user lg");
    }

    @Override
    public void registrate() {
        System.out.println("user rg");
    }
}
