public class Main {
    public static void main(String[] args) {
        // Create a Genre
        Genre rap = new Genre("Rap", "A genre characterized by rhythmic speech.");

        // Create an Artist
        Artist travisScott = new Artist("Rap", "A genre characterized by rhythmic speech.",
                "Travis Scott", 32, "SICKO MODE", "Astroworld", 5000000);

        // Test Polymorphism
        rap.updateListeners(true); // Calls Genre's method
        travisScott.updateListeners(true); // Calls Artist's overridden method

        // Collaboration
        Artist theWeeknd = new Artist("Pop", "A genre with catchy melodies.",
                "The Weeknd", 33, "Blinding Lights", "After Hours", 7000000);
        travisScott.collaborate(theWeeknd);
    }
}
