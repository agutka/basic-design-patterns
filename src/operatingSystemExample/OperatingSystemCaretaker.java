package operatingSystemExample;

public class OperatingSystemCaretaker {

    private OperatingSystemMemento operatingSystemMemento;

    public void addMemento(OperatingSystemMemento operatingSystemMemento) {
        this.operatingSystemMemento = operatingSystemMemento;
    }

    public OperatingSystemMemento getOperatingSystemMemento() {
        return operatingSystemMemento;
    }
}
