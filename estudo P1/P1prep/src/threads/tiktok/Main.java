package untitled.src.threads.tiktok;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        tiquetaque tt = new tiquetaque();
        ThreadTiqueTaque taque = new ThreadTiqueTaque(tt, "taque");
        ThreadTiqueTaque tique = new ThreadTiqueTaque(tt, "Tique");

        tique.t.join();
        taque.t.join();
    }
}
