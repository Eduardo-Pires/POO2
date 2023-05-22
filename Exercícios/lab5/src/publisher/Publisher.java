package publisher;

import listener.EventListener;


public interface Publisher {

    void subscribe(EventListener listener);

    void unsubscribe(EventListener listener);

    void oNotify();

}
