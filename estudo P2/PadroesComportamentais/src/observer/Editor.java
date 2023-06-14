package observer;

import java.util.ArrayList;
import java.util.List;

public class Editor implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String conteudo;

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
        notifyObserver();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }
}
