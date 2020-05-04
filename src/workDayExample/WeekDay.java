package workDayExample;

public abstract class WeekDay {

    public final void everyDayAreExactlyTheSame(TypeOfTransport transport) {
        wakeUp();
        getReady();
        int time = goWork(transport);
        summary(time);
        work();
        goHome();
    }

    private void goHome() {
        System.out.println("Powrót do domu.");
    }

    private void summary(int time) {
        System.out.println("Trasa do pracy zajęła: " + time + " minut.");
    }

    private void getReady() {
        System.out.println("Przygotowania do wyjścia.");
    }

    private void wakeUp() {
        System.out.println("Pobudka.");
    }

    protected abstract void work();
    protected abstract int goWork(TypeOfTransport transport);
}
