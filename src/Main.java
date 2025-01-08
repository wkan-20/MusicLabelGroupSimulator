import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the genre options to the user
        System.out.println("Please choose a music genre to begin the simulator (1,2,3)");
        System.out.println("1.Rap");
        System.out.println("2.Techno");
        System.out.println("3.Pop");

        int genreChoice = scanner.nextInt();
        scanner.nextLine();

        // Declare empty variables for genre, artist and producer
        Genre selectedGenre = null;
        Artist selectedArtist = null;
        Producer selectedProducer = null;

        // User chooses from 3 genres
        if (genreChoice == 1) {
            selectedGenre = new Genre("Rap", "A genre characterized by rhythmic speech.");
            selectedArtist = new Artist("Rap", "A genre characterized by rhythmic speech.",
                    "Travis Scott", 32, "SICKO MODE", "Astroworld", 70000000);
            selectedProducer = new Producer("Rap", "A genre characterized by rhythmic speech", "Cactus Jack", 100, true);
        } else if (genreChoice == 2) {
            selectedGenre = new Genre("Techno", "Fast electric beats");
            selectedArtist = new Artist("Techno", "Fast electric beats", "deadMaus", 43, "Strobe", "4 x 4 = 12", 4700000);
            selectedProducer = new Producer("Techno", "Fast electric beats", "Mau5trap", 200, false);
        } else if (genreChoice == 3) {
            selectedGenre = new Genre("Pop", "Catchy melodies with a focus on harmony");
            selectedArtist = new Artist("Pop", "Catchy melodies with a focus on harmony", "Olivia Rodrigo", 21, "Drivers License", "SOUR", 47900000);
            selectedProducer = new Producer("Pop", "Catchy melodies with a focus on harmony", "Interscope", 150, true);
        } else {
            System.out.println("Invalid choice. Please restart the program and select a valid genre.");
            return;
        }

        // Display initial artist information using the method
        selectedArtist.printArtistInfo();

        // Loop to simulate 5x months
        for (int month = 1; month <= 5; month++) {
            System.out.println("Month " + month);

            // Randomly select an event for both the artist and the producer
            String[] events = {"concert", "buzz", "scandal"};
            String artistEvent = events[(int) (Math.random() * events.length)];
            String producerEvent = events[(int) (Math.random() * events.length)];

            // Simulate the events for the artist and producer

            selectedArtist.simulateEvent(artistEvent);
            selectedProducer.simulateEvent(producerEvent);

            // update listener count after the event
            System.out.println("Current monthly listeners for " + selectedArtist.getName() + ": " + selectedArtist.getMonthlyListeners());
            System.out.println("Current monthly listeners for producer " + selectedProducer.getLabelName() + ": " + selectedProducer.getMonthlyListeners());

            // Asks user if they want to continue
            System.out.print("\nDo you want to simulate the next month? y/n: ");
            String userInput = scanner.nextLine().toLowerCase();

            // Continuing/ Ending simulator
            if (userInput.equals("n")) {
                System.out.println("The simulator has ended");
                break;
            } else if (!userInput.equals("y")) { // if not y or n print invalid
                System.out.println("Invalid input. Please enter y or n");
                month--;
            }
        }

        scanner.close();
    }
}
