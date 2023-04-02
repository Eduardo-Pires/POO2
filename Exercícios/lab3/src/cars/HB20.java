package cars;

import accessories.Acessorio;
import motors.Motor;

public class HB20 implements Carro {
    private final Motor motor;
    private final Acessorio acessorio;

    public HB20(Motor motor, Acessorio acessorio) {
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
        System.out.println("viiiiiiiiiii");
    }

    @Override
    public String toString() {
        return "HB20{" +
                "motor=" + motor.getModelo() +
                ", acessorio=" + acessorio.getTipo() +
                '}';
    }
}
