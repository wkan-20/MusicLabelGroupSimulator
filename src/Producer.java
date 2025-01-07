public class Producer extends Genre {
    private String labelName;
    private int tracksProduced;
    private boolean isAwardWinning;

    // Constructor
    public Producer(String genreName, String genreDescription, String labelName, int tracksProduced, boolean isAwardWinning) {
        super(genreName, genreDescription); // Calls the Genre constructor
        this.labelName = labelName; // Fixed redundant assignment
        this.tracksProduced = tracksProduced;
        this.isAwardWinning = isAwardWinning;
    }

    // Getters and Setters
    public String getLabelName() {
        return labelName;
    }
    public String getgenreName() {
        return genreName;
    }
    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public int getTracksProduced() {
        return tracksProduced;
    }

    public void setTracksProduced(int tracksProduced) {
        this.tracksProduced = tracksProduced;
    }

    public boolean isAwardWinning() {
        return isAwardWinning;
    }

    public void setAwardWinning(boolean awardWinning) {
        isAwardWinning = awardWinning;
    }

    // Override Polymorphic Method
    @Override
    public void updateListeners(boolean concertOrBuzz) {
        // Base listener increase
        this.monthlyListeners += 10000; // Flat increase for each month

        // Add additional listeners if there's a buzz
        if (concertOrBuzz) {
            this.monthlyListeners += 50000; // Add 50,000 if there's a buzz
            System.out.println(this.getgenreName() + " generated buzz! Monthly listeners increased by 50,000.");
        }
    }

    // Custom Method
    public void produceTrack(String trackName) {
        System.out.println("Producer from " + labelName + " has produced a new track: " + trackName);
        this.tracksProduced++;
    }

    // Override toString Method
    @Override
    public String toString() {
        return "Producer{" +
                "Label Name='" + labelName + '\'' +
                ", Tracks Produced=" + tracksProduced +
                ", Award Winning=" + isAwardWinning +
                ", Monthly Listeners=" + monthlyListeners +
                '}';
    }
}
