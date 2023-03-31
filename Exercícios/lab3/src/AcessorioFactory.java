public interface AcessorioFactory {
    Acessorio criarRoda(String tipo, String marca, int quantidade);
    Acessorio criarAirbag(String tipo, String marca, int quantidade);
    Acessorio criarCamera(String tipo, String marca, int quantidade);
    Acessorio criarCaixaDeSom(String tipo, String marca, int quantidade);

}
