package motors;

public class MotorKia implements Motor{
    private final String modelo;
    private final float consumoCombustivel;
    private final int potencia;

    public MotorKia(String modelo, float consumoCombustivel, int potencia) {
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