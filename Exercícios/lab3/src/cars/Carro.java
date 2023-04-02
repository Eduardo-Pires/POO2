package cars;

import accessories.Acessorio;
import motors.Motor;

public interface Carro {

        Motor getMotor();

        Acessorio getAcessorio();

        void dirigir();

}
