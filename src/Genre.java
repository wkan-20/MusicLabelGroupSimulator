public class Genre {
    protected String genreName;
    private String genreDescription;
    protected int monthlyListeners; // Make this protected so subclasses can access it

    // Constructor
    public Genre(String genreName, String genreDescription) {
        this.genreName = genreName;
        this.genreDescription = genreDescription;
        this.monthlyListeners = 0; // Initialize to 0
    }

    // Getters and Setters
    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreDescription() {
        return genreDescription;
    }

    public void setGenreDescription(String genreDescription) {
        this.genreDescription = genreDescription;
    }

    public int getMonthlyListeners() {
        return monthlyListeners;
    }

    public void setMonthlyListeners(int monthlyListeners) {
        this.monthlyListeners = monthlyListeners;
    }

    // Updates listeners
    public void updateListeners(boolean concertOrBuzz, int additionalListeners) {
        if (concertOrBuzz) {
            this.monthlyListeners += additionalListeners;
            System.out.println("Listeners increased by " + additionalListeners);
        } else {
            this.monthlyListeners -= additionalListeners;
            System.out.println("Listeners decreased by " + additionalListeners);
        }
    }

    public void simulateEvent(String event) {
        System.out.println("Simulating event for genre: " + genreName);
    }
}
