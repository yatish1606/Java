public class Song {
    String nameOfSong;
    int durationOfSong;

    public Song(String nameOfSong, int durationOfSong) {
        this.nameOfSong = nameOfSong;
        this.durationOfSong = durationOfSong;
    }

    public Song() {
        this("undefinedSong", 0);
    }
    public Song addNewSong(String nameOfSong, int durationOfSong) {
        return new Song(nameOfSong, durationOfSong);
    }

    public String getNameOfSong() {
        return this.nameOfSong;
    }

    public void printSong() {
        System.out.println(this.nameOfSong + "\t" + this.durationOfSong);
    }
}
