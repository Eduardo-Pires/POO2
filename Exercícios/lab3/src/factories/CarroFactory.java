package factories;

import accessories.Acessorio;
import cars.Carro;
import motors.Motor;

public interface CarroFactory {
    Acessorio criarAcessorio(String tipo, int quantidade);
    Motor criarMotor(String modelo, float consumoCombustivel, int potencia);
    Carro criarCarro(Motor motor, Acessorio acessorio);
}
