import java.util.ArrayList;
import java.util.Arrays;

public class SpotiJy {
    private Artist[] artists;

    public SpotiJy() {
        this.artists = new Artist[0];
    }

    public Artist[] getArtists() {
        return artists;
    }

    public void addArtists(Artist[] artists) {
        ArrayList<Artist> tempArtistsArrayList = new ArrayList<>(Arrays.asList(this.artists));

        for (Artist artist: artists)
            if(!tempArtistsArrayList.contains(artist))
                tempArtistsArrayList.add(artist);

        this.artists = tempArtistsArrayList.toArray(new Artist[0]);
    }

    public String [] getTopTrendingArtist() {
        Artist topArtist = null;

        for (Artist artist: this.artists)
            if(topArtist == null || artist.totalLikes() > topArtist.totalLikes())
                topArtist = artist;

        assert topArtist != null;

        return new String[] {topArtist.getFirstName(), topArtist.getLastName()};
    }

    public String getTopTrendingAlbum() {
        Album topAlbum = null;
        int topAlbumTotalLikes = 0, currentAlbumTotalLikes = 0;

        for (Artist artist: this.artists) {
            for (Album album : artist.getAlbums()) {
                // calculate current album total likes
                currentAlbumTotalLikes = 0;

                for (Song song: album.getSongs())
                    currentAlbumTotalLikes += song.getLikes();

                // compare with current one
                if (topAlbum == null || currentAlbumTotalLikes > topAlbumTotalLikes) {
                    topAlbum = album;
                    topAlbumTotalLikes = currentAlbumTotalLikes;
                }
            }
        }

        assert topAlbum != null;

        return topAlbum.getTitle();
    }

    public String getTopTrendingSong() {
        Song currentTrend = null, currentArtistTrend;

        for (Artist artist: this.artists) {
            currentArtistTrend = artist.mostLikedSong();

            if (currentTrend == null || currentArtistTrend.getLikes() > currentTrend.getLikes())
                currentTrend = currentArtistTrend;
        }

        return currentTrend.getTitle();
    }
}