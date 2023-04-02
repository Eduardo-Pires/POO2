package cars;

import accessories.Acessorio;
import motors.Motor;

public class Corolla implements Carro {
    private Motor motor;
    private Acessorio acessorio;

    public Corolla(Motor motor, Acessorio acessorio) {
        this.motor = motor;
        this.acessorio = acessorio;
    }

    @Override
    public Motor getMotor() {
        return motor;
    }

    @Override
    public Acessorio getAcessorio() {
        return acessorio;
    }

    @Override
    public void dirigir() {
        //são onomatopéias :P
        System.out.println("rrom-rrom");
    }

    @Override
    public String toString() {
        return "Corolla{" +
                "motor=" + motor.getModelo() +
                ", acessorio=" + acessorio.getTipo() +
                '}';
    }
}