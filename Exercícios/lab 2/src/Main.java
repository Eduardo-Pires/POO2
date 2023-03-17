import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        File files= new File("src/files");
        int filesSize = Objects.requireNonNull(files.list()).length;

        for (int i = 1; i <= filesSize; i++)
        {
            (new ex01("src/files/file" + i +".txt")).start();
        }
    }
}
