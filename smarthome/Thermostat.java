package smarthome;

public class Thermostat implements Device {
    private int temperature = 24;

    @Override
    public void turnOn() {
        System.out.println("\nThermostat turned ON at " + temperature + "°C");
    }

    @Override
    public void turnOff() {
        System.out.println("\nThermostat turned OFF");
    }

    @Override
    public void increase() {
        temperature++;
        System.out.println("\nTemperature increased to " + temperature + "°C");
    }

    @Override
    public void decrease() {
        temperature--;
        System.out.println("\nTemperature decreased to " + temperature + "°C");
    }
}
