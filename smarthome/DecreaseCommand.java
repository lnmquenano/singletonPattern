package smarthome;

public class DecreaseCommand implements Command {
    private Device device;
    public DecreaseCommand(Device device) { 
        this.device = device; 
    }

    public void execute() { 
        device.decrease(); 
    }
}
