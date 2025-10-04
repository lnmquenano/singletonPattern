package smarthome;

public class Light implements Device {
    private int brightness = 50;

    @Override
    public void turnOn() {
        System.out.println("\nLight turned ON at brightness " + brightness + "%");
    }

    @Override
    public void turnOff() {
        System.out.println("\nLight turned OFF");
    }

    @Override
    public void increase() {
        brightness = Math.min(brightness + 10, 100);
        System.out.println("\nLight brightness increased to " + brightness + "%");
    }

    @Override
    public void decrease() {
        brightness = Math.max(brightness - 10, 0);
        System.out.println("\nLight brightness decreased to " + brightness + "%");
    }
}