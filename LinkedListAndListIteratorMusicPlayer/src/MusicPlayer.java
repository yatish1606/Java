import java.util.LinkedList;
import java.util.ListIterator;

public class MusicPlayer {
    public static void main(String[] args) {

        LinkedList<Album> listOfAlbums = new LinkedList<Album>();

        ListIterator<Album> albumIterator = listOfAlbums.listIterator();

        listOfAlbums.add(new Album().createNewAlbum("Rock"));

        Album requiredAlbum = null;
        for(Album eachAlbum : listOfAlbums) {
            if(eachAlbum.getNameOfAlbum().equals("Rock")) {
                requiredAlbum = eachAlbum;
                break;
            }
        }

        while(albumIterator.hasNext()){
            if(albumIterator.next().getNameOfAlbum().equals("Rock")){
                requiredAlbum = albumIterator.previous();
                albumIterator.next();
                break;
            }
        }

        requiredAlbum.addSongToAlbum("We will rock you", 3);
        requiredAlbum.printAlbum();
    }
}
