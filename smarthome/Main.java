package smarthome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Devices
        Device light = new Light();
        Device thermostat = new Thermostat();
        Device musicPlayer = new MusicPlayer();

        RemoteControl remote = new RemoteControl();

        while (true) {
            System.out.println("\n\n1) Light \n2) Thermostat \n3) Music Player \n0) Exit");
            System.out.print("Select a device (input number): ");
            int deviceChoice = scanner.nextInt();
            if (deviceChoice == 0) break;

            Device selectedDevice;
            switch (deviceChoice) {
                case 1 -> selectedDevice = light;
                case 2 -> selectedDevice = thermostat;
                case 3 -> selectedDevice = musicPlayer;
                default -> { System.out.println("Invalid device"); continue; }
            }

            System.out.println("\n1) Turn On \n2) Turn Off \n3) Increase \n4) Decrease");
            System.out.print("Choose a command (input number): ");
            int commandChoice = scanner.nextInt();

            Command command = switch (commandChoice) {
                case 1 -> new TurnOnCommand(selectedDevice);
                case 2 -> new TurnOffCommand(selectedDevice);
                case 3 -> new IncreaseCommand(selectedDevice);
                case 4 -> new DecreaseCommand(selectedDevice);
                default -> null;
            };

            if (command != null) {
                remote.setCommand(command);
            } else {
                System.out.println("Invalid command");
            }
        }

        scanner.close();
        System.out.println("Exiting Smart Home Control System.");
    }
}