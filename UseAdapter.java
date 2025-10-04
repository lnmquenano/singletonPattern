package elecdev;

import java.util.Scanner;

public class UseAdapter {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            PowerOutlet laptopOutlet = new LaptopAdapter(new Laptop());
            PowerOutlet fridgeOutlet = new RefrigeratorAdapter(new Refrigerator());
            PowerOutlet phoneOutlet = new SmartphoneAdapter(new Smartphone());
            
            while (true) {
                System.out.println("\n\n1. Laptop");
                System.out.println("2. Refrigerator");
                System.out.println("3. Smartphone");
                System.out.println("0. Nevermind");
                System.out.print("What device to plug in?: ");
                if (scan.hasNextInt() == false) {
                    System.out.println("\nEnter a device's number only.");
                    scan.next();
                    continue;
                }
                int deviceChoice = scan.nextInt();
                if (deviceChoice == 0) break;
                
                switch (deviceChoice) {
                    case 1 -> laptopOutlet.plugIn();
                    case 2 -> fridgeOutlet.plugIn();
                    case 3 -> phoneOutlet.plugIn();
                    default -> { System.out.println("\nNo said device."); continue; }
                }
                System.out.println("\nWould you like to plug in another device? (y/n)");
                char again = scan.next().toLowerCase().charAt(0);
                if (again != 'y') {
                    break;
                }
            }
        }
    }
}