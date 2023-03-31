public class MotorKia implements Motor{
    private int consumoCombustível;
    private int potencia;

    public MotorKia(int consumoCombustível, int potencia) {
        this.consumoCombustível = consumoCombustível;
        this.potencia = potencia;
    }

    @Override
    public int getConsumoCombustivel() {
        return consumoCombustível;
    }

    @Override
    public int getPotencia() {
        return potencia;
    }
}