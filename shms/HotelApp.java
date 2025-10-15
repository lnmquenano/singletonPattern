package shms;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            FrontDesk fd = new FrontDesk();

            while (true) {
                System.out.println("\n\nSimplified Hotel Management System");
                System.out.println("1.Valet Service");
                System.out.println("2.Housekeeping Service");
                System.out.println("3.Request Cart/s");
                System.out.println("0.Exit");
                System.out.print("\nChoose a service: ");
                int choice = scan.nextInt();
                if (choice == 0) {
                    System.out.println("\n\nThank you! Visit again.\n");
                    return;
                }

                switch (choice) {
                    case 1 -> { System.out.print("\nProvide your vehicle plate #: "); fd.requestValet(scan.next()); }
                    case 2 -> { System.out.print("\nProvide your room #: "); fd.requestCleaning(scan.nextInt()); }
                    case 3 -> { System.out.print("\n# of carts you wish to request for: "); fd.requestCart(scan.nextInt()); }
                    default -> { System.out.println("\nUnavailable service or invalid choice. Please choose again.");
                    }
                }

                System.out.println("\nWould you like to choose a service again? (y/n)");
                char again = scan.next().toLowerCase().charAt(0);
                if (again != 'y') {
                    System.out.println("\nThank you! Visit again.");
                    break;
                }
            }
        }
    }
}