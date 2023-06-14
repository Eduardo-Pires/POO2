package observer;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        Leitor leitor1 = new Leitor("Leitor 1 ");
        Leitor leitor2 = new Leitor("Leitor 2 ");
        Leitor leitor3 = new Leitor("Leitor 3 ");

        editor.attach(leitor1);
        editor.attach(leitor2);
        editor.attach(leitor3);

        editor.setConteudo("conteudo1");

        editor.detach(leitor2);

        editor.setConteudo("conteudo2");

    }
}
