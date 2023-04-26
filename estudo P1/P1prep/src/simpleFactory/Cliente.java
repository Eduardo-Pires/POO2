package P1prep.src.simpleFactory;

public class Cliente implements SystemUser{
    @Override
    public void login() {
        System.out.println("cliente lg");
    }

    @Override
    public void registrate() {
        System.out.println("cliente rt");
    }
}
