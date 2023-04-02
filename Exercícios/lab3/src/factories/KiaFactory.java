package factories;

import accessories.Acessorio;
import accessories.AcessorioKia;
import cars.Carro;
import cars.Ceratto;
import motors.Motor;
import motors.MotorKia;

public class KiaFactory implements CarroFactory{
    @Override
    public Acessorio criarAcessorio(String tipo, int quantidade) {
        return new AcessorioKia(tipo, quantidade);
    }

    @Override
    public Motor criarMotor(String modelo, float consumoCombustivel, int potencia) {
        return new MotorKia(modelo, consumoCombustivel, potencia);
    }

    @Override
    public Carro criarCarro(Motor motor, Acessorio acessorio) {
        if(motor instanceof MotorKia && acessorio instanceof AcessorioKia)
        {
            return new Ceratto(motor, acessorio);
        }
        else
        {
            throw new IllegalArgumentException("Tanto o motor quanto o acessório deve ser da Kia");
        }
    }
}
