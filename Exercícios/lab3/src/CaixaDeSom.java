public class CaixaDeSom implements Acessorio{
    private String tipo;
    private String marca;
    private int quantidade;

    public CaixaDeSom(String tipo, String marca, int quantidade) {
        this.tipo = tipo;
        this.marca = marca;
        this.quantidade = quantidade;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }
}
