import accessories.Acessorio;
import cars.Carro;
import factories.*;
import motors.Motor;

public class Main {
    public static void main(String[] args) {
        HyundaiFactory fabricaHyundai = new HyundaiFactory();
        ToyotaFactory fabricaToyota = new ToyotaFactory();
        KiaFactory fabricaKia = new KiaFactory();

        Acessorio bancos = fabricaHyundai.criarAcessorio("Banco Aquecido", 4);
        Motor motor1_0L = fabricaHyundai.criarMotor("Motor 1.0L",12.8f, 80);
        Carro hb20_2024 = fabricaHyundai.criarCarro(motor1_0L, bancos);

        System.out.println(hb20_2024);
        hb20_2024.dirigir();

        System.out.println();

        Acessorio multimidia = fabricaToyota.criarAcessorio("Sistema Multimidia", 1);
        Motor motor2_0L =fabricaToyota.criarMotor("Motor 2.0L", 10.9f, 154);
        Carro corolla2024 = fabricaToyota.criarCarro(motor2_0L, multimidia);

        System.out.println(corolla2024);
        corolla2024.dirigir();

        System.out.println();

        Acessorio arCondicionado = fabricaKia.criarAcessorio("Ar condicionado digital", 1);
        Motor motor1_6L = fabricaKia.criarMotor("Motor 1.6L", 11.2f, 128);
        Carro ceratto2024 = fabricaKia.criarCarro(motor1_6L, arCondicionado);

        System.out.println(ceratto2024);
        ceratto2024.dirigir();
    }
}