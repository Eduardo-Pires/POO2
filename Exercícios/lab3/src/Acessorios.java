public class Acessorios implements AcessorioFactory{
    @Override
    public Acessorio criarRoda(String tipo, String marca, int quantidade) {
        return new Roda(tipo, marca, quantidade);
    }

    @Override
    public Acessorio criarAirbag(String tipo, String marca, int quantidade) {
        return new Airbag(tipo, marca, quantidade);
    }

    @Override
    public Acessorio criarCamera(String tipo, String marca, int quantidade) {
        return new Camera(tipo, marca, quantidade);
    }

    @Override
    public Acessorio criarCaixaDeSom(String tipo, String marca, int quantidade) {
        return new CaixaDeSom(tipo, marca, quantidade);
    }
}
