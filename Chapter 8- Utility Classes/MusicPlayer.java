public class MusicPlayer{
    public static void main(String[] args) {
        MusicDownloader mySong = new MusicDownloader("Pink Pony Club", "Chappell Roan", "Midwest Princess", "https://www.spotify.com/pink-pony-club.mp3", 2003);
        mySong.sameSong("Pink Pony Club");

    }
}

class MusicDownloader{
    private String songName;
    private String artistName;
    private String album;
    private String fileLink;
    private int releaseYear;
    public MusicDownloader(String songName, String artistName, String album, String fileLink, int releaseYear){
        this.songName = songName;
        this.artistName = artistName;
        this.album = album;
        this.fileLink = fileLink;
        this.releaseYear = releaseYear;
    }
    public MusicDownloader(){
        this.songName= "Carry On Wayward Son";
        this.artistName = "Kansas";
        this.album= "Leftoverture";
        this.fileLink= "/carry-on";
        this.releaseYear = 1976;
    }
    public String getSongName(){
        return this.songName;
    }
    public String getArtistName(){
        return this.artistName;
    }
    public String getAlbum(){
        return this.album;
    }
    public String showFileLink(){
        String returnString = String.format("Link for %s is: %s", this.songName, this.fileLink);
        return returnString;
    }
    public int getReleaseYear(){
        return this.releaseYear;
    }
    public void sameSong(String songTitle){
        if (this.songName.equalsIgnoreCase(songName)) {
            System.out.println("Link for " + this.songName + " is: " + this.fileLink);
        }
    }
}

