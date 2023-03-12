package EX04to09;

public class Corredor extends Atleta{
    public Corredor(String nome, int idade, float peso, float altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    public void jogar() {
        System.out.println("Correndo");
    }
}
