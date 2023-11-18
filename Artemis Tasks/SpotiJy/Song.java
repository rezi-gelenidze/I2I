public class Song {
    private String title;
    private int releaseYear;
    private int duration;
    private int likes;

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public int getLikes() {
        return likes;
    }

    public Song(String title, int releaseYear, int duration, int likes) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.likes = likes;
    }

    public Song(String title, int releaseYear, int duration) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.likes = 0;
    }

    public Song(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = 60;
        this.likes = 0;
    }

    public boolean changeDuration(int duration) {
        boolean isValid = duration >= 0 && duration <= 720 && duration != this.duration;
        if (isValid) {
            this.duration = duration;
            return true;
        }
        return false;
    }

    public void like() { this.likes++; }
    public void unlike() { if (this.likes > 0) this.likes--; }

    public boolean isEqual(Song other) {
        return this.title.equals(other.title) &&
                this.releaseYear == other.releaseYear &&
                this.duration == other.duration;
    }

    @Override
    public String toString() {
        double durationInMinutes = (double) this.duration / 60;
        return "Title:" + this.title +
                ",Duration:" + durationInMinutes + " minutes" +
                ",Release year:" + this.releaseYear +
                ",Likes:" + this.likes;
    }
}
