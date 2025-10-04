package smarthome;

public class IncreaseCommand implements Command {
    private Device device;
    public IncreaseCommand(Device device) { 
        this.device = device; 
    }

    public void execute() { 
        device.increase(); 
    }
}
