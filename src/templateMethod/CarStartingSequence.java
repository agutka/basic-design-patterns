package templateMethod;

public abstract class CarStartingSequence {

    public final void StartTheCar() {
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Wciskamy pedał gazu.");
    }

    private void fastenSeatbelts() {
        System.out.println("Zapinamy pas.");
    }

    public abstract void startTheIgnition();
    public abstract void setTheGear();
}
