package shms;

public class Cart implements HotelService {
    public void startService() {
        System.out.println("\nRequesting cart service...");
    }

    void requestCart(int numberOfCarts) {
        System.out.println("Received " + numberOfCarts + " luggage cart/s.");
    }
}