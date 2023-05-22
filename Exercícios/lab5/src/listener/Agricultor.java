package listener;

import java.util.Random;

public class Agricultor implements EventListener{
    private float temperatura;
    private float umidade;
    private float chuva;
    private final int codigo;

    public Agricultor()
    {
        Random random = new Random();
        this.codigo = random.nextInt()  * 50000;;
    }

    public int getCodigo()
    {
        return codigo;
    }
    public void update(float temperatura, float umidade, float chuva, float velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.chuva = chuva;

        // Exibir os atributos atualizados
        System.out.println("Agricultor #" + codigo + ":");
        System.out.println("Temperatura atualizada: " + this.temperatura);
        System.out.println("Umidade atualizada: " + this.umidade);
        System.out.println("Chuva atualizada: " + this.chuva);
        System.out.println();
    }
}
