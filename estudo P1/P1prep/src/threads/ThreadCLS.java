package untitled.src.threads;

public class ThreadCLS implements Runnable{

    private String nome;
    private int tempo;

    public ThreadCLS(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    public void run()
    {
        for (int i = 0; i < 6; i++) {
            System.out.println(nome + " contador " + i);

            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
