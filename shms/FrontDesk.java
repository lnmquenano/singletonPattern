package shms;

public class FrontDesk {
    private Valet valet = new Valet();
    private HouseKeeping houseKeeping = new HouseKeeping();
    private Cart cart = new Cart();

    void requestValet(String plateNumber) {
        valet.startService();
        valet.pickUpVehicle(plateNumber);
    }
    void requestCleaning(int roomNumber) {
        houseKeeping.startService();
        houseKeeping.cleanRoom(roomNumber);
    }
    void requestCart(int numberOfCarts) {
        cart.startService();
        cart.requestCart(numberOfCarts);
    }
}