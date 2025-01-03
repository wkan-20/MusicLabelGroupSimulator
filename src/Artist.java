public class Genre {
}

public class Artist extends Genre {
    private String name;
    private int age;
    private String song;
    private String bestAlbum;
    private int monthlyListeners;
    private boolean concert;

    // Constructor
    public Artist(String genreName, String genreDescription, String name, int age, String song, String bestAlbum, int monthlyListeners) {
        super(genreName, genreDescription); // Call Genre's constructor
        this.name = name;
        this.age = age;
        this.song = song;
        this.bestAlbum = bestAlbum;
        this.monthlyListeners = monthlyListeners;
        this.concert = false;
    }

    // Getters and Setters for Artist-specific attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getBestAlbum() {
        return bestAlbum;
    }

    public void setBestAlbum(String bestAlbum) {
        this.bestAlbum = bestAlbum;
    }

    public int getMonthlyListeners() {
        return monthlyListeners;
    }

    public void setMonthlyListeners(int monthlyListeners) {
        this.monthlyListeners = monthlyListeners;
    }

    public boolean isConcert() {
        return concert;
    }

    public void setConcert(boolean concert) {
        this.concert = concert;
    }

    // Override Polymorphic Method
    @Override
    public void updateListeners(boolean concertOrBuzz) {
        if (concertOrBuzz) {
            this.monthlyListeners += 50000; // Increase specific to Artist
        }
    }

    // Collaboration Method
    public void collaborate(Artist collaborator) {
        System.out.println(this.name + " is collaborating with " + collaborator.getName());
    }
}
