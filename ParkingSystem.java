public class ParkingSystem {

    // Global variables
    static int entry = 0;
    static int exit = 0;
    static int totalAvailableSpace = 50;

    public static void main(String[] args) {

        // Thread for Entry
        Thread entryThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(15000); // 15 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                entry++; // simulate one vehicle entering
                System.out.println("Entry count: " + entry);
            }
        });

        // Thread for Exit
        Thread exitThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(15000); // 15 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                exit++; // simulate one vehicle exiting
                System.out.println("Exit count: " + exit);
            }
        });

        // Thread for Calculating Available Space
        Thread calculationThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000); // calculate every 5 sec
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int available = totalAvailableSpace - entry + exit;

                // Limit check
                if (available > totalAvailableSpace) {
                    available = totalAvailableSpace;
                } else if (available < 0) {
                    available = 0;
                }

                System.out.println("Available Parking Space: " + available);
            }
        });

        // Start all threads
        entryThread.start();
        exitThread.start();
        calculationThread.start();
    }
}