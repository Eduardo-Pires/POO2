package motors;

public class MotorToyota implements Motor{
    private final float consumoCombustivel;
    private final int potencia;
    private final String modelo;

    public MotorToyota(String modelo, float consumoCombustivel, int potencia) {
        this.modelo = modelo;
        this.consumoCombustivel = consumoCombustivel;
        this.potencia = potencia;
    }

    @Override
    public float getConsumoCombustivel() {
        return consumoCombustivel;
    }

    @Override
    public int getPotencia() {
        return potencia;
    }

    @Override
    public String getModelo() {
        return modelo;
    }
}