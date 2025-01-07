public class Genre {
    protected String genreName;
    private String genreDescription;
    protected int monthlyListeners; // Make this protected so subclasses can access it

    // Constructor
    public Genre(String genreName, String genreDescription) {
        this.genreName = genreName;
        this.genreDescription = genreDescription;
        this.monthlyListeners = 0; // Initialize to 0 or any default value
    }

    // Getters and Setters for genreName and genreDescription
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

    // Getter and Setter for monthlyListeners
    public int getMonthlyListeners() {
        return monthlyListeners;
    }

    public void setMonthlyListeners(int monthlyListeners) {
        this.monthlyListeners = monthlyListeners;
    }


    // Method to update listeners
    public void updateListeners(boolean concertOrBuzz) {
        if (concertOrBuzz) {
            this.monthlyListeners += 10000; // Create coin flip to check 1/2 chance
            System.out.println("There's a buzz!");
        }
    }

}
