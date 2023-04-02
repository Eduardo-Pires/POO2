package accessories;

public class AcessorioHyundai implements Acessorio{
    private final String tipo;
    private final int quantidade;

    public AcessorioHyundai(String tipo, int quantidade) {
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
