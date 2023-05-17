import editor.PrevisaoTempo;

public class Main {
    public static void main(String[] args) {
        PrevisaoTempo previsaoTempo = new PrevisaoTempo();
        previsaoTempo.events.subscribe(new LogOpenListener("file.path"));
        previsaoTempo.events.subscribe("save", new EmailNotificationListener("email@email.email"));

        try {
            previsaoTempo.openFile("test.txt");
            previsaoTempo.saveFile();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
