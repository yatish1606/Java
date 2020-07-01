import java.util.ArrayList;
import java.util.Scanner;

public class Album {
    private String nameOfAlbum;
    private int numberOfSongsInAlbum = 0;
    private SongList listOfSongs = new SongList();

    public Album(String nameOfAlbum) {
        this.nameOfAlbum = nameOfAlbum;
    }

    public void addNewSong(){
        if(listOfSongs.addNewSong()) {
            System.out.println("New Song added to album " + nameOfAlbum);
            System.out.println("The number of songs in album " + nameOfAlbum + " is " + numberOfSongsInAlbum);
        } else {
            System.out.println("Could not add song in album " + nameOfAlbum);
        }

    }

    public void removeSong(String nameOfSong) {
        if(listOfSongs.removeSong(nameOfSong)) {
            System.out.println(nameOfSong + " successfully removed from album " + nameOfAlbum);
            System.out.println("The number of songs in album " + nameOfAlbum + " is " + numberOfSongsInAlbum);
        } else {
            System.out.println("Could not delete " + nameOfSong + "  from album " + nameOfAlbum + ". It is most likely that the song does not exist in the album");
        }
    }

    public static Scanner input = new Scanner((System.in));


    public class SongList {
        private ArrayList<Song> songs = new ArrayList<Song>();


        private boolean addNewSong() {

            try {
                System.out.println("\nEnter name of song : ");
                String nameOfSong = input.nextLine();
                System.out.println("\nEnter song duration in minutes.seconds : ");
                double durationOfSong = input.nextDouble();
                input.nextLine();
                System.out.println("\nEnter the name of the singer : ");
                String singer = input.nextLine();

                songs.add(new Song(nameOfSong,durationOfSong,singer));
                numberOfSongsInAlbum++;
                return true;
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }

        }

        private boolean removeSong(String nameOfSong) {

            boolean isFound = false;
            int id = 0;

            for(Song eachSong : songs) {
                if(eachSong.getNameOfSong().equals(nameOfSong)) {
                    id = songs.indexOf(eachSong);
                    isFound = true;
                    break;
                }
            }

            if(!isFound) {
                return false;
            } else {
                try {
                    songs.remove(id);
                    numberOfSongsInAlbum--;
                    return true;
                } catch (Exception e) {
                    return false;
                }

            }
        }
    }
}
