public class HB20 implements Carro{
    private Motor aspirado;
    private Acessorio acessorio;

    public HB20(Motor aspirado, Acessorio acessorio) {
        this.aspirado = aspirado;
        this.acessorio = acessorio;
    }

    @Override
    public Motor getMotor() {
        return aspirado;
    }

    @Override
    public Acessorio getAcessorio() {
        return acessorio;
    }
}
