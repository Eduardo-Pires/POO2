public class HyundaiFactory implements CarroFactory{

    @Override
    public Motor criarMotor(int consumoCombustivel, int potencia) {
        return new MotorHyundai(consumoCombustivel, potencia);
    }

    @Override
    public Acessorio criarAcessorio(String tipo, int quantidade) {
        return new AcessorioHyundai(tipo, quantidade);
    }

    @Override
    public Carro criarCarro(Motor motor, Acessorio acessorio) {
        return new HB20(motor, acessorio);
    }

}
