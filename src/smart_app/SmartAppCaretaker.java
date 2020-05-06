package smart_app;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCaretaker {

    private List<SmartAppMemento> mementos = new ArrayList<>();

    public void addMemento(SmartAppMemento smartAppMemento) {
        mementos.add(smartAppMemento);
        System.out.println("Zapisana wersja: " + smartAppMemento.getVersion() + " znajduje sie pod indeksem: " + (mementos.size() -1 ));
    }

    public SmartAppMemento getMemento(int index) {
        System.out.println("Wczytano wersje: " + mementos.get(index).getVersion());
        return mementos.get(index);
    }
}
