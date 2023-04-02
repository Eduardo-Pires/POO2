package accessories;

public class AcessorioKia implements Acessorio{
    private final String tipo;
    private final int quantidade;

    public AcessorioKia(String tipo, int quantidade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }
}
