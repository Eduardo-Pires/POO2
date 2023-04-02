package cars;

import accessories.Acessorio;
import motors.Motor;

public class Ceratto implements Carro {
    private final Motor motor;
    private final Acessorio acessorio;

    public Ceratto(Motor motor, Acessorio acessorio) {
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
        System.out.println("vruuum-vruuum");
    }

    @Override
    public String toString() {
        return "Ceratto{" +
                "motor=" + motor.getModelo() +
                ", acessorio=" + acessorio.getTipo() +
                '}';
    }
}