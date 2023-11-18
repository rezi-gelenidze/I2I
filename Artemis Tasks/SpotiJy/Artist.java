import java.util.Comparator;

public class Artist {
    private String firstName;
    private String lastName;
    private int birthYear;
    private Album[] albums;
    private Song[] singles;

    public Artist(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }

    public Song[] getSingles() {
        return singles;
    }

    public void setSingles(Song[] singles) {
        this.singles = singles;
    }

    private Song filterSongByLikes(Comparator<Song> comparator) {
        Song result = null;

        // iterate singles
        for (Song song: this.singles) {
            if (result == null || comparator.compare(song, result) > 0)
                result = song;
        }

        // iterate array of albums and albums itself
        for (Album album: this.albums) {
            for (Song song: album.getSongs()) {
                if (result == null || comparator.compare(song, result) > 0)
                    result = song;
            }
        }

        return result;
    }

    // factor out aggregation logic and use comparators for passing comparison logic
    public Song mostLikedSong() {
        return filterSongByLikes(Comparator.comparingInt(Song::getLikes).reversed());
    }
    public Song leastLikedSong() {
        return filterSongByLikes(Comparator.comparingInt(Song::getLikes));
    }

    public int totalLikes() {
        int total = 0;

        // iterate singles
        for (Song song: this.singles)
            total += song.getLikes();

        // iterate array of albums and albums itself
        for (Album album: this.albums)
            for (Song song: album.getSongs())
                total += song.getLikes();

        return total;
    }

    public boolean isEqual(Artist other) {
        return this.firstName.equals(other.firstName) &&
                this.lastName.equals(other.lastName) &&
                this.birthYear == other.birthYear;
    }

    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();

        representation.append("Name: ").append(this.firstName).append(" ").append(this.lastName).append(",");
        representation.append("Birth year:").append(this.birthYear).append(',');
        representation.append("Total likes: ").append(this.totalLikes());

        return representation.toString();
    }
}
