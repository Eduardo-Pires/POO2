public class AcessorioHyundai implements Acessorio{
    private String tipo;
    private int quantidade;

    public AcessorioHyundai(String tipo, int quantidade) {
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
