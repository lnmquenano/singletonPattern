package schoolsys;

import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner (System.in)) {
            SchoolManagementApp attendance = new AttendanceSystemAdapter(new AttendanceSystem());
            SchoolManagementApp grading = new GradingSystemAdapter(new GradingSystem());
            SchoolManagementApp library = new LibrarySystemAdapter(new LibrarySystem());

            while (true) {
                System.out.println("\n\nSchool Management System");
                System.out.println("Please select an option from below:");
                System.out.println("\n1. Attendance System");
                System.out.println("2. Grading System");
                System.out.println("3. Library System");
                System.out.println("0. Exit");
                System.out.print("Enter desired number: ");
                if (scan.hasNextInt() == false) {
                    System.out.println("\nEnter a number only.");
                    scan.next();
                    continue;
                }
                int choice = scan.nextInt();
                if (choice == 0) {
                    System.out.println("\nThank you for using the School Management System.");
                    break;
                }

                switch (choice) {
                case 1 -> attendance.integrateSystem();
                case 2 -> grading.integrateSystem();
                case 3 -> library.integrateSystem();
                default -> { System.out.println("\nChoose an available choice."); continue;
                }
                }
                System.out.println("\nWould you like to use the system again? (y/n)");
                char again = scan.next().toLowerCase().charAt(0);
                if (again != 'y') {
                    System.out.println("\nThank you for using the School Management System.");
                    break;
                }
            }
        }
    }
}
