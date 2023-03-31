public class Ceratto implements Carro {
    private Motor motor;
    private Acessorio acessorio;

    public Ceratto(Motor aspirado, Acessorio acessorio) {
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