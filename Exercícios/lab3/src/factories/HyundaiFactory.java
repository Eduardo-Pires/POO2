package factories;

import accessories.Acessorio;
import accessories.AcessorioHyundai;
import cars.Carro;
import cars.HB20;
import motors.Motor;
import motors.MotorHyundai;

public class HyundaiFactory implements CarroFactory{

    @Override
    public Motor criarMotor(String modelo, float consumoCombustivel, int potencia) {
        return new MotorHyundai(modelo, consumoCombustivel, potencia);
    }

    @Override
    public Acessorio criarAcessorio(String tipo, int quantidade) {
        return new AcessorioHyundai(tipo, quantidade);
    }

    @Override
    public Carro criarCarro(Motor motor, Acessorio acessorio) {
        if(motor instanceof MotorHyundai && acessorio instanceof AcessorioHyundai)
        {
            return new HB20(motor, acessorio);
        }
        else
        {
            throw new IllegalArgumentException("Tanto o motor quanto o acessório deve ser da Hyundai");
        }
    }
}
