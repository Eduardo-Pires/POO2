package P1prep.src.simpleFactory;

public class Administrador implements SystemUser{

    @Override
    public void login() {
        System.out.println("Adm lg");
    }

    @Override
    public void registrate() {
        System.out.println("Adm rg");
    }
}
