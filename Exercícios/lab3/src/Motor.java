public class Motor {
    private String marca;
    private int consumoCombustivel;
    private int potencia;

    public Motor(String marca, int consumoCombustivel, int potencia) {
        this.marca = marca;
        this.consumoCombustivel = consumoCombustivel;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public int getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public int getPotencia() {
        return potencia;
    }
}
