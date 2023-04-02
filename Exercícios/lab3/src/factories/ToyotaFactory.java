package factories;

import accessories.Acessorio;
import accessories.AcessorioToyota;
import cars.Carro;
import cars.Corolla;
import motors.Motor;
import motors.MotorToyota;

public class ToyotaFactory implements CarroFactory {
    @Override
    public Acessorio criarAcessorio(String tipo, int quantidade) {
        return new AcessorioToyota(tipo, quantidade);
    }

    @Override
    public Motor criarMotor(String modelo, float consumoCombustivel, int potencia) {
        return new MotorToyota(modelo, consumoCombustivel, potencia);
    }

    @Override
    public Carro criarCarro(Motor motor, Acessorio acessorio) {
        return new Corolla(motor, acessorio);
    }
}
