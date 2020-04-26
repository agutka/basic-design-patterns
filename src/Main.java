import adapter.*;

public class Main {

    public static void main(String[] args) {

        ContinentalDevice radio = new ContinentalDevice() {
            @Override
            public void powerOn() {
                System.out.println("Gra muzyka");
            }
        };

        UKDevice ukRadio = new UKDevice() {
            @Override
            public void on() {
                System.out.println("Angielskie radio");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();
        UKSocket ukSocket = new UKSocket();

        continentalSocket.plugIn(radio);
        ukSocket.plugIn(ukRadio);

        //oneWayAdapter
        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);
        continentalSocket.plugIn(adapter);

        //twoWayAdapter
        ToWayAdapter twoWayAdapter = new ToWayAdapter(ukRadio,radio);
        continentalSocket.plugIn(twoWayAdapter);
        ukSocket.plugIn(twoWayAdapter);
    }
}
