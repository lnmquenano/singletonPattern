package smarthome;

public class RemoteControl {
    public void setCommand(Command command) {
        command.execute();
    }
}