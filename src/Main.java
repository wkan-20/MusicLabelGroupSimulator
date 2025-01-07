import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user to select a genre
        System.out.println("Select a genre:");
        System.out.println("1. Rap");
        System.out.println("2. Techno");
        System.out.println("3. Pop");

        int genreChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the number input

        // Genre SuperClass
        Genre selectedGenre = null;

        // Create the selected genre and corresponding artist and producer
        Artist selectedArtist = null;
        Producer selectedProducer = null;

        switch (genreChoice) {
            case 1: // Rap
                selectedGenre = new Genre("Rap", "A genre characterized by rhythmic speech.");
                selectedArtist = new Artist("Rap", "A genre characterized by rhythmic speech.",
                        "Travis Scott", 32, "SICKO MODE", "Astroworld", 70000000);
                selectedProducer = new Producer("Rap", "A genre characterized by rhythmic speech", "Cactus Jack", 100, true);
                break;
            case 2: // Techno
                selectedGenre = new Genre("Techno", "Fast electric beats");
                selectedArtist = new Artist("Techno", "Fast electric beats", "deadMaus", 43, "Strobe", "4 x 4 = 12", 4700000);
                selectedProducer = new Producer("Techno", "Fast electric beats", "Mau5trap", 200, false);
                break;
            case 3: // Pop
                selectedGenre = new Genre("Pop", "Catchy melodies with a focus on harmony");
                selectedArtist = new Artist("Pop", "Catchy melodies with a focus on harmony", "Olivia Rodrigo", 21, "Drivers License", "SOUR", 47900000);
                selectedProducer = new Producer("Pop", "Catchy melodies with a focus on harmony", "Interscope", 150, true);
                break;
            default:
                System.out.println("Invalid choice, please restart the program and select a valid genre.");
                return; // Exit if the user selects an invalid option
        }

        // Display artist and producer information before starting the simulation
        System.out.println("\nSelected Artist Information:");
        System.out.println("Name: " + selectedArtist.getName());
        System.out.println("Age: " + selectedArtist.getAge());
        System.out.println("Hit Song: " + selectedArtist.getSong());
       // System.out.println("Album: " + selectedArtist.getbestAlbum());
        System.out.println("Monthly Listeners: " + selectedArtist.getMonthlyListeners());

        System.out.println("\nSelected Producer Information:");
        System.out.println("Label Name: " + selectedProducer.getLabelName());
        System.out.println("Tracks Produced: " + selectedProducer.getTracksProduced());
        System.out.println("Award Winning: " + selectedProducer.isAwardWinning());
        System.out.println("Monthly Listeners: " + selectedProducer.getMonthlyListeners());

        // Simulate Event for 5x (months)
        for (int month = 1; month <= 5; month++) {
            System.out.println("\nMonth " + month + ":");

            // Monthly Updates
            boolean buzz = Math.random() > 0.5;  // 50% chance for buzz

            // Artist Updates
            selectedArtist.updateListeners(buzz); // Update artist's listeners based on buzz

            // Producer Updates
            selectedProducer.updateListeners(buzz); // Update producer's listeners based on buzz

            // Print selected artist's current monthly listeners
            System.out.println("Current monthly listeners for " + selectedArtist.getName() + ": " + selectedArtist.getMonthlyListeners());

            // Print selected producer's current monthly listeners
            System.out.println("Current monthly listeners for producer " + selectedProducer.getLabelName() + ": " + selectedProducer.getMonthlyListeners());

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
