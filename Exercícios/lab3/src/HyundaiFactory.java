public class HyundaiFactory implements CarroFactory{
    @Override
    public Motor criarMotor(String marca, int consumoCombustivel, int potencia) {
        return new Motor(marca, consumoCombustivel, potencia);
    }

    @Override
    public Carro criarCarro(Motor motor, Acessorio roda, Acessorio airbag, Acessorio camera, Acessorio vidroEletrico, Acessorio kitMultimidia, Acessorio caixaDeSom) {
        return new Carro(motor, roda, airbag, camera, vidroEletrico, kitMultimidia, caixaDeSom);
    }

}
