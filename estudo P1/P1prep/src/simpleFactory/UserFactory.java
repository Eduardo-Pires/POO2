package P1prep.src.simpleFactory;

public class UserFactory {

    public static SystemUser create(String tipo)
    {
        return switch (tipo) {
            case "Usuario" -> new Usuario();
            case "Cliente" -> new Cliente();
            case "Administrador" -> new Administrador();
            default -> throw new RuntimeException("Classe inexistente");
        };
    }
}
