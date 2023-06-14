package observer;

public class Leitor implements Observer{
    private String nome;

    public Leitor(String nome)
    {
        this.nome = nome;
    }
    @Override
    public void update() {
        System.out.println(nome + " recebeu uma solicitação");
    }
}
