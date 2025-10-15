package shms;

public class HouseKeeping implements HotelService {
    public void startService() {
        System.out.println("\nRequesting housekeeping service...");
    }

    void cleanRoom(int roomNumber) {
        System.out.println("Room #" + roomNumber + " cleaned.");
    }
}