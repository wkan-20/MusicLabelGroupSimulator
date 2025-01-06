public class Producer extends Genre {
    private String labelName;
    private int tracksProduced;
    private boolean isAwardWinning;

    // Constructor
    public Producer(String genreName, String genreDescription, String labelName, int tracksProduced, boolean isAwardWinning) {
        super(genreName, genreDescription); // Calls the Genre constructor
        this.labelName = labelName;
        this.tracksProduced = tracksProduced;
        this.isAwardWinning = isAwardWinning;
    }

    // Getters and Setters
    public String getLabelName() {
        return labelName;
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
        if (concertOrBuzz) {
            this.monthlyListeners += 20000; // Smaller boost for producers
        }
    }

    // Custom Method
    public void produceTrack(String trackName) {
        System.out.println("Producer from " + labelName + " has produced a new track: " + trackName);
        this.tracksProduced++;
    }
}
