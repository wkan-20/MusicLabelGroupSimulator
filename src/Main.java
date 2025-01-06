import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Genre SuperClass
        Genre rap = new Genre("Rap", "A genre characterized by rhythmic speech.");

        // Artist Creation
        Artist travisScott = new Artist("Rap", "A genre characterized by rhythmic speech.",
                "Travis Scott", 32, "SICKO MODE", "Astroworld", 70000000);

        Artist deadMaus = new Artist("Techno", "Fast electric beats", "deadMaus", 43, "Strobe", "4 x 4 = 12", 4700000);

        Artist oliviaRodrigo = new Artist("Pop", "Catchy melodies with a focus on harmony", "Olivia Rodrigo", 21, "Drivers License", "SOUR", 47900000);
        // Simulate Event for 5x (months)
        Scanner scanner = new Scanner(System.in);
        for (int month = 1; month <= 5; month++) {
            System.out.println("Month " + month + ":");

            // Monthly Updates
            boolean buzz = Math.random() > 0.5;
            if (buzz == true)
            {
                System.out.println("There is a buzz!");
            }
            travisScott.updateListeners(true); // Example of artist's listeners updating
            deadMaus.updateListeners(true);
            oliviaRodrigo.updateListeners(true);
            // Print all artist's current monthly listeners
            System.out.println("Current monthly listeners for " + travisScott.getName() + ": " + travisScott.getMonthlyListeners());
            System.out.println("Current monthly listeners for " + deadMaus.getName() + ": " + deadMaus.getMonthlyListeners());
            System.out.println("Current monthly listeners for " + oliviaRodrigo.getName() + ": " + oliviaRodrigo.getMonthlyListeners());

            // User prompt to simulate next month
            System.out.print("Simulate next month? (y/n): ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("n")) {
                System.out.println("Simulation stopped.");
                break;  // Exit the loop if the user enters 'n'
            } else if (!input.equals("y")) {
                System.out.println("Invalid input. Please enter 'y' to continue or 'n' to stop.");
                month--;  // Repeat the current month if the input is invalid
            }
        }
        scanner.close();
    }
}
