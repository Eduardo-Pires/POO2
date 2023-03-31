public interface CarroFactory {
    public Motor criarMotor(String marca, int consumoCombustivel, int potencia);
    public Carro criarCarro(Motor motor, Acessorio roda, Acessorio airbag, Acessorio camera, Acessorio vidroEletrico, Acessorio kitMultimidia, Acessorio caixaDeSom);
}
