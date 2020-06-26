import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

public class AudioFile implements Saveable {
    private String nameOfAudio;
    private double lengthOfAudio;
    private String singerOfAudio;

    public AudioFile(String nameOfAudio, double lengthOfAudio, String singerOfAudio) {
        this.nameOfAudio = nameOfAudio;
        this.lengthOfAudio = lengthOfAudio;
        this.singerOfAudio = singerOfAudio;
    }

    @Override
    public String toString() {
        return ("Audio Name : " + this.nameOfAudio + "\nAudio Length : " + this.lengthOfAudio + "\nSinger : " + this.singerOfAudio);
    }

    @Override
    public void read(List<String> listToRead) {
        if(listToRead != null && listToRead.size() > 0) {
            this.nameOfAudio = listToRead.get(0);
            this.lengthOfAudio = Double.parseDouble(listToRead.get(1));
            this.singerOfAudio = listToRead.get(2);
        }
    }

    @Override
    public List<String> write() {
        List<String> listToWrite = new ArrayList<>();
        listToWrite.add(this.nameOfAudio);
        listToWrite.add(Double.toString(this.lengthOfAudio));
        listToWrite.add(this.singerOfAudio);

        return listToWrite;
    }
}
