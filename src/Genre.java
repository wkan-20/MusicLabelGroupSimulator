public class Genre {
    private String genreName;
    private String genreDescription;
    protected int monthlyListeners; // Make this protected so subclasses can access it

    // Constructor
    public Genre(String genreName, String genreDescription) {
        this.genreName = genreName;
        this.genreDescription = genreDescription;
        this.monthlyListeners = 0; // Initialize to 0 or any default value
    }

    // Getters and Setters
    public int getMonthlyListeners() {
        return monthlyListeners;
    }

    public void setMonthlyListeners(int monthlyListeners) {
        this.monthlyListeners = monthlyListeners;
    }

    // Method to update listeners
    public void updateListeners(boolean concertOrBuzz) {
        if (concertOrBuzz) {
            this.monthlyListeners += 10000;
            System.out.println("There's a buzz!");
        }
    }
}
