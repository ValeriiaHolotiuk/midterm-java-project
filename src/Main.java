import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create sample objects
        Doctor doctor = new Doctor("D001", "Dr. House", 50, "123-456-7890", "Diagnostics");
        Medication med = new Medication("M001", "Ibuprofen", "200mg", 100);

        boolean running = true;

        while (running) {
            System.out.println("\n=== Pharmacy System Menu ===");
            System.out.println("1. View doctor information");
            System.out.println("2. View medication information");
            System.out.println("3. Restock medication");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Doctor: " + doctor);
                    break;
                case "2":
                    System.out.println("Medication: " + med);
                    break;
                case "3":
                    System.out.print("Enter amount to restock: ");
                    try {
                        int amount = Integer.parseInt(scanner.nextLine());
                        med.setQuantityInStock(med.getQuantityInStock() + amount);
                        System.out.println("Restocked! New quantity: " + med.getQuantityInStock());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number.");
                    }
                    break;
                case "4":
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
