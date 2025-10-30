public class CentralQueue {
    private static CentralQueue instance = null;
    private int queueNum;
    
    private CentralQueue() {
        this.queueNum = 0;
    }

    public static CentralQueue getInstance() {
        if (instance == null) {
            instance = new CentralQueue();
        }
        return instance;
    }

    public void getQueueNum() {
        ++queueNum;
        int queueNumber = queueNum;
        System.out.println("\nYour Queue number is " + queueNumber);
    }

    public void displayCurrentQueueNum() {
        if (queueNum == 0) {
            System.out.print("\nNo queue number has been issued yet.\n");
        } else {
            System.out.print("\nCurrent Queue number is " + queueNum + "\n");
        }
        
    }

    public void resetQueueNum(int number) {
        if (number >= 0) {
            queueNum = number;
            System.out.print("\nQueue number has been reset.\n");
        } else {
            System.out.print("\nInvalid queue number. Must be positive.\n");
        }
    }
}