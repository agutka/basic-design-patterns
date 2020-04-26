package adapter;

public class ToWayAdapter implements UKDevice, ContinentalDevice {

    UKDevice ukDevice;
    ContinentalDevice continentalDevice;

    public ToWayAdapter(UKDevice ukDevice, ContinentalDevice continentalDevice) {
        this.ukDevice = ukDevice;
        this.continentalDevice = continentalDevice;
    }

    @Override
    public void powerOn() {
        ukDevice.on();
    }

    @Override
    public void on() {
        continentalDevice.powerOn();
    }
}
