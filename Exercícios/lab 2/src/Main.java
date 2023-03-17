import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        File files= new File("src/files");
        int filesSize = Objects.requireNonNull(files.list()).length;
        ArrayList<EX01> ex01 = new ArrayList<>();

        for (int i = 1; i <= filesSize; i++)
        {
            ex01.add((new EX01("src/files/file" + i +".txt")));
            ex01.get(ex01.size() - 1).start();
        }

        for (EX01 trd:
                ex01) {
            trd.join();
        }

        System.out.println("soma final: " + Counting.getFinalCounter());
    }
}
