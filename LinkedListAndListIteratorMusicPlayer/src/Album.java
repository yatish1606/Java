import javax.xml.crypto.AlgorithmMethod;
import java.util.ArrayList;

public class Album {
    private String nameOfAlbum;
    private ArrayList<Song> listOfSongs = new ArrayList<Song>();

    public Album(String nameOfAlbum) {
        this.nameOfAlbum = nameOfAlbum;
    }

    public Album() {
        this("undefinedAlbum");
    }

    public Album createNewAlbum(String nameOfAlbum) {
        return new Album(nameOfAlbum);
    }

    public void addSongToAlbum(String nameOfSong, int durationOfSong) {
        for(Song eachSong : listOfSongs) {
            if(eachSong.getNameOfSong().equals(nameOfSong)) {
                System.out.println("\nSong already exists in this album");
                return;
            }
        }
        listOfSongs.add(new Song().addNewSong(nameOfSong,durationOfSong));
    }

    public void printAlbum() {
        for(Song eachSong : listOfSongs) {
            eachSong.printSong();
        }
    }

    public String getNameOfAlbum() {
        return this.nameOfAlbum;
    }
}
