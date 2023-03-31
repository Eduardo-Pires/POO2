public class Corolla implements Carro{
    private Motor motor;
    private Acessorio acessorio;

    public Corolla(Motor aspirado, Acessorio acessorio) {
        this.motor = aspirado;
        this.acessorio = acessorio;
    }

    @Override
    public Motor getMotor() {
        return motor;
    }

    @Override
    public Acessorio getAcessorio() {
        return acessorio;
    }
}