import java.util.Scanner;

public class UserInterfaceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=" .repeat(50));
        System.out.println(".  FITNESS TRACKER - Steps and Distance Calculator");
        System.out.println("=" .repeat(50));

        do {
            // Display menu
            System.out.println("\nMain Menu");
            System.out.println("1. Pretty print step statistics");
            System.out.println("2. Convert distance walked (km) into steps");
            System.out.println("3. Exit");
            System.out.println("\nEnter your choice (1-3): ");

            // Input validation
            while(!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number (1-3)");
                scanner.next();  // Clear invalid input

            }
            choice = scanner.nextInt();

            if (choice == 1) {
                // Option 1: Pretty print existing step statistics
                System.out.println("\n--- Pretty Print Step Statistics ---");

                // Get thousands
                System.out.print("Enter number of thousands: ");
                while(!scanner.hasNextInt()) {
                    System.out.println("Invalid! Enter a valid number: ");
                    scanner.next();
                    
                }
                int thousands = scanner.nextInt();
                scanner.nextLine();
                while(thousands < 0) {
                    System.out.print("Thousands cannot be negative. Enter again ");
                    thousands = scanner.nextInt();
                }

                // Get hundreds
                System.out.print("Enter number of hundreds: ");
                while(!scanner.hasNextInt()) {
                    System.out.println("Invalid! Enter a valid number: ");
                    scanner.next();

                }
                int hundreds = scanner.nextInt();
                scanner.nextLine();
                while(hundreds < 0) {
                    System.out.print("Hundreds cannot be negative. Enter again: ");
                    hundreds = scanner.nextInt();
                    scanner.nextLine();
                }

                // Get tens
                System.out.print("Enter number of tens: ");
                while(!scanner.hasNextInt()) {
                    System.out.print("Invalid! Enter a valid number: ");
                    scanner.next();
                }
                int tens = scanner.nextInt();
                scanner.nextLine();
                while(tens < 0) {
                    System.out.print("Tens cannot be negative. Enter again: ");
                    tens = scanner.nextInt();
                    scanner.nextLine();
                }

                // Create StepsStats object and display
                StepStats stats = new StepStats(thousands, hundreds, tens);
                System.out.println("\nResult: ");
                stats.prettyPrint();
                
            } else if(choice == 2) {
                // Option 2: Convert distance to steps
                System.out.println("\n--- Convert Distance to Steps");

                // Get distance in km
                System.out.print("Enter distance walked (in km): ");
                while(!scanner.hasNextDouble()) {
                    System.out.print("Invalid! Enter a valid number (e.g 1.7): ");
                    scanner.next();
                }
                double km = scanner.nextDouble();
                while (km < 0) {
                    System.out.print("Distance cannot be negative. Enter again: ");
                    km = scanner.nextDouble();
                }

                // Convert and display
                Distance distance = new Distance(km);
                StepStats result = distance.convert();
                System.out.print("\n" + km + " km = ");
                result.prettyPrint();
            } else if (choice == 3) {
                //Exit
                System.out.println("\nThank you for using Fitness Tracker!");
                System.out.println("Keep stepping to stay very strong and healhy!");
            } else {
                // Invalid choice
                System.out.println("\nInvalid choice! Please enter 1, 2, or 3.");
            }
        } while (choice != 3);
        scanner.close();
    }
}
