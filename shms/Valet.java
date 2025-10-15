package shms;

public class Valet implements HotelService {
    public void startService() {
        System.out.println("\nRequesting valet service...");
    }

    void pickUpVehicle(String plateNumber) {
        System.out.println("Vehicle with plate #" + plateNumber + " picked up.");
    }
}