package publisher;

import listener.EventListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class PrevisaoTempo implements Publisher {
    private final  List<EventListener> listeners;
    private float temperatura;
    private float umidade;
    private float chuva;
    private float velocidadeVento;
    Random random = new Random();

    public PrevisaoTempo() {
      listeners = new ArrayList<>();
    }

    public void subscribe(EventListener listener)
    {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener)
    {
        listeners.remove(listener);
    }

    public void oNotify()
    {
        listeners.forEach(listener -> listener.update(this.temperatura,this.umidade,this.chuva,this.velocidadeVento));
    }

    public EventListener getListener(int index)
    {
        return listeners.get(index);
    }

    public int size()
    {
        return listeners.size();
    }

    public void executar()
    {
        while (true) {
            temperatura = random.nextFloat() * 40;
            umidade = random.nextFloat() * 100;
            chuva = random.nextFloat();
            velocidadeVento = random.nextFloat();

            oNotify();

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
