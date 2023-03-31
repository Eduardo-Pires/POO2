public class KiaFactory implements CarroFactory{
    @Override
    public Acessorio criarAcessorio(String tipo, int quantidade) {
        return new AcessorioKia(tipo, quantidade);
    }

    @Override
    public Motor criarMotor(int consumoCombustivel, int potencia) {
        return new MotorKia(consumoCombustivel, potencia);
    }

    @Override
    public Carro criarCarro(Motor motor, Acessorio acessorio) {
        return new Ceratto(motor, acessorio);
    }
}
