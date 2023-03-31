public class AcessorioKia implements Acessorio{
    private String tipo;
    private int quantidade;

    public AcessorioKia(String tipo, int quantidade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public int getQuantidade() {
        return 0;
    }
}
