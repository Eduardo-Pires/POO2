package untitled.src.threads.tiktok;

public class ThreadTiqueTaque  implements Runnable{

    tiquetaque tt;
    Thread t;
    final int num = 5;

    public ThreadTiqueTaque(tiquetaque tt, String nome) {
        this.tt = tt;
        this.t = new Thread(this, nome);
        t.start();
    }

    @Override
    public void run() {
        if (t.getName().equalsIgnoreCase("Tique"))
        {
            for (int i = 0; i < num; i++)
            {
                tt.tique(true);
                try {
                    t.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            tt.tique(false);
        }
        else
        {
            for (int i = 0; i < num; i++)
            {
                tt.taque(true);
                try {
                    t.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            tt.taque(false);
        }
    }
}
