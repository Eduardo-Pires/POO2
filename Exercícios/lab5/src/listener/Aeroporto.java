package listener;

import java.util.Random;

public class Aeroporto implements EventListener{
    private float temperatura;
    private float umidade;
    private float chuva;
    private float velocidadeVento;
    private final int codigo;

    public Aeroporto()
    {
        Random random = new Random();
        this.codigo = random.nextInt() * 50000;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void update(float temperatura, float umidade, float chuva, float velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.chuva = chuva;
        this.velocidadeVento = velocidadeVento;

        // Exibir os atributos atualizados
        System.out.println("Aeroporto #" + codigo + ":");
        System.out.println("Temperatura atualizada: " + this.temperatura);
        System.out.println("Umidade atualizada: " + this.umidade);
        System.out.println("Chuva atualizada: " + this.chuva);
        System.out.println("Velocidade do Vento atualizada: " + this.velocidadeVento);
        System.out.println();
    }
}
