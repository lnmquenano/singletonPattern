package smarthome;

public class MusicPlayer implements Device {
    private int volume = 50;

    @Override
    public void turnOn() {
        System.out.println("\nMusic Player turned ON at " + volume + "% volume --> Playing BEST playlist ( plst listen :) )");
    }

    @Override
    public void turnOff() {
        System.out.println("\nMusic Player turned OFF");
    }

    @Override
    public void increase() {
        volume = Math.min(volume + 10, 100);
        System.out.println("\nMusic Player volume increased to " + volume + "%");
    }

    @Override
    public void decrease() {
        volume = Math.max(volume - 10, 0);
        System.out.println("\nMusic Player volume decreased to " + volume + "%");
    }
}