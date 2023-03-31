public interface CarroFactory {
    public Acessorio criarAcessorio(String tipo, int quantidade);
    public Motor criarMotor(int consumoCombustivel, int potencia);
    public Carro criarCarro(Motor motor, Acessorio acessorio);
}
