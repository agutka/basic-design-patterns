package workDayExample;

public class MyDay extends WeekDay {

    @Override
    protected void work() {
        System.out.println("Pracuje i koduje.");
    }

    @Override
    protected int goWork(TypeOfTransport transport) {
        return switch (transport) {
            case CAR -> 15;
            case TRAM -> 20;
            case BIKE -> 25;
        };
    }
}
