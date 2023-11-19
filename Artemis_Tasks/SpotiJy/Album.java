import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Album {
    private String title;
    private int releaseYear;
    private Song[] songs;

    public String getTitle() { return this.title; }

    public int getReleaseYear() { return this.releaseYear; }

    public Song[] getSongs() { return this.songs; }

    public Album(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public int addSongs(Song[] songs) {
        if (this.songs == null) {
            this.songs = songs; // directly assign given songs
            return songs.length;
        }

        int count = 0;
        // copy all songs in a new arraylist
        ArrayList<Song> newSongs = new ArrayList<>(Arrays.asList(this.songs));

        for (Song song: songs) {
            // if array list don't contain song, add it and increment count
            if (!newSongs.contains(song)) {
                newSongs.add(song);
                count++;
            }
        }

        // convert back to array
        this.songs = newSongs.toArray(new Song[0]);
        return count;
    }

    public Song[] shuffle() {
        // shuffle using Fisher-Yates shuffle algorithm
        Song[] shuffledCopy = this.songs.clone();

        int len = shuffledCopy.length;
        int target;
        Song temp;
        
        for (int i = len - 1; i > 0; i--) {
            target = (int) (Math.random() * (i + 1));
            
            temp = shuffledCopy[i];
            shuffledCopy[i] = shuffledCopy[target];
            shuffledCopy[target] = temp;
        }

        return shuffledCopy;
    }

    public static Song[] reverse(Song[] songs) {
        Song[] reversedSongs = songs.clone();

        Song temp;
        int rightIndex;
        int len = reversedSongs.length;

        // reverse array by swapping left and right elements (mirroring)
        for (int i = 0; i < len / 2; i++) {
            rightIndex = len - 1 - i;

            temp = reversedSongs[i];
            reversedSongs[i] = reversedSongs[rightIndex];
            reversedSongs[rightIndex] = temp;
        }

        return reversedSongs;
    }

    /*
    * I've decided to use Merge Sort as it's efficient to use.
    * Due to the scenario that I have to implement sorting 4 times,
    * I have factored out MergeSort logic separately, which works for
    * sort by title, duration, releaseYear and popularity.
    * I have used comparator for that, which is passed to the constructor.
    * Then sort(Song[] data) method is called which clones passed
    * array and returns a sorted copy.
    * */
    public Song[] sortByTitle(boolean isAscending) {
        Comparator<Song> comparator = Comparator.comparing(Song::getTitle);
        MergeSort sorter = new MergeSort(comparator, isAscending);
        return sorter.sort(this.songs);
    }

    public Song[] sortByDuration(boolean isAscending) {
        Comparator<Song> comparator = Comparator.comparingInt(Song::getDuration);
        MergeSort sorter = new MergeSort(comparator, isAscending);
        return sorter.sort(this.songs);
    }

    public Song[] sortByReleaseYear(boolean isAscending) {
        Comparator<Song> comparator = Comparator.comparingInt(Song::getReleaseYear);
        MergeSort sorter = new MergeSort(comparator, isAscending);
        return sorter.sort(this.songs);
    }

    public Song[] sortByPopularity(boolean isAscending) {
        Comparator<Song> comparator = Comparator.comparingInt(Song::getLikes);
        MergeSort sorter = new MergeSort(comparator, isAscending);
        return sorter.sort(this.songs);
    }

    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();

        representation.append("Title:").append(this.title);
        representation.append(",Release year:").append(this.releaseYear);
        representation.append(",songs:{");

        for (Song song: this.songs)
            representation.append(song.toString()).append("|");

        representation.append("}");

        return representation.toString();
    }
}
