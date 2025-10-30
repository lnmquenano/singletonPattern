import java.util.Scanner;

public class PagIbig {
    public static void main (String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            CentralQueue centralQ = CentralQueue.getInstance();
            
            while(true) {
                System.out.print("\n== Centralized Queueing System ==");
                System.out.print("\nSelect an option:\n1. Get Queue number\n2. Display Current Queue number\n3. Reset Queue number\n0. Exit\nChoice: ");
                int choice = scan.nextInt();
                if (choice == 0) {
                    System.out.println("\nThanks for using CQS.\n");
                    break;
                }

            switch (choice) {
                case 1 -> centralQ.getQueueNum();
                case 2 -> centralQ.displayCurrentQueueNum();
                case 3 -> centralQ.resetQueueNum(0);
                default -> { System.out.println("\nInvalid choice. Please try again."); continue;
                    }
                }   

                System.out.print("\nWould you like to use the system again? (y/n): ");
                char again = scan.next().toLowerCase().charAt(0);
                if (again != 'y') {
                    System.out.println("\nThanks for using CQS.\n");
                    break;
                }
            }
        }
    }
}