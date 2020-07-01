public class Song {
    private String nameOfSong;
    private double lengthOfSong;
    private String singer;

    public Song(String nameOfSong, double lengthOfSong, String singer) {
        this.nameOfSong = nameOfSong;
        this.lengthOfSong = lengthOfSong;
        this.singer = singer;
    }

    public String getNameOfSong() {
        return this.nameOfSong;
    }
}
