package listener;

import java.util.Random;

public class Jornal implements EventListener {
    private float temperatura;
    private float chuva;

    private final int codigo;

    public Jornal()
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
        this.chuva = chuva;

        // Exibir os atributos atualizados
        System.out.println("Jornal #" + codigo + ":");
        System.out.println("Temperatura atualizada: " + this.temperatura);
        System.out.println("Chuva atualizada: " + this.chuva);
        System.out.println();
    }
}
