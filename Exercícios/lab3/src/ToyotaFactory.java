public class ToyotaFactory implements CarroFactory{
    @Override
    public Acessorio criarAcessorio(String tipo, int quantidade) {
        return new AcessorioToyota(tipo, quantidade);
    }

    @Override
    public Motor criarMotor(int consumoCombustivel, int potencia) {
        return new MotorToyota(consumoCombustivel, potencia);
    }

    @Override
    public Carro criarCarro(Motor motor, Acessorio acessorio) {
        return new Corolla(motor, acessorio);
    }
}
