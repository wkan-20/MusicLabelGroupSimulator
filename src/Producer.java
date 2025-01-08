public class Producer extends Genre {
    private String labelName;
    private int tracksProduced;
    private boolean awardWinning;
    private int monthlyListeners;

    // Constructor
    public Producer(String genreName, String genreDescription, String labelName, int tracksProduced, boolean awardWinning) {
        super(genreName, genreDescription);
        this.labelName = labelName;
        this.tracksProduced = tracksProduced;
        this.awardWinning = awardWinning;
        this.monthlyListeners = 0; // Start with 0 listeners
    }

    // Updates listener method
    public void updateListeners(boolean buzz, int baselineGrowth) {
        // Baseline growth when no event
        this.monthlyListeners += baselineGrowth;

        // If buzz is true, add bonus to listeners
        if (buzz) {
            this.monthlyListeners += 5000;  // Add boost for buzz
            System.out.println(this.labelName + " gained extra listeners from buzz!");
        }
    }

    // Method to simulate an event for the producer
    public void simulateEvent(String event) {

        // Check for "concert"
        if (event.equals("concert")) {
            this.monthlyListeners += 10000; // +10000 when concert
            System.out.println(this.labelName + " held a concert! Monthly listeners increased!");
        }
        // Check for "buzz"
        else if (event.equals("buzz")) {
            this.monthlyListeners += 3000; // +3000 when buzz
            System.out.println(this.labelName + " generated buzz! Monthly listeners increased!");
        }
        // Check for "scandal"
        else if (event.equals("scandal")) {
            this.monthlyListeners -= 5000; // Decrease listeners -5000
            System.out.println(this.labelName + " faced a scandal. Monthly listeners decreased.");
        }
        // Handle unknown events
        else {
            System.out.println("Unknown event. No changes made.");
        }
    }


    // Getters
    public String getLabelName() {
        return labelName;
    }

    public int getMonthlyListeners() {
        return monthlyListeners;
    }

    public int getTracksProduced() {
        return tracksProduced;
    }

    public boolean isAwardWinning() {
        return awardWinning;
    }
}
