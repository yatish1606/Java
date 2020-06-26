import java.util.ArrayList;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

public class VideoFile implements Saveable {
    private String nameOfVideo;
    private double lengthOfVideo;
    private int maxResolutionOfVideo;
    private double sizeOfVideo;

    public VideoFile(String nameOfVideo, double lengthOfVideo, int maxResolutionOfVideo, double sizeOfVideo) {
        this.nameOfVideo = nameOfVideo;
        this.lengthOfVideo = lengthOfVideo;
        this.maxResolutionOfVideo = maxResolutionOfVideo;
        this.sizeOfVideo = sizeOfVideo;
    }

    @Override
    public String toString() {
        return ("Name of Video : " + this.nameOfVideo + "\nLength of Video : " + this.lengthOfVideo + "\nMaximum Video Resolution : " + this.maxResolutionOfVideo + "\nSize of video : " + this.sizeOfVideo);
    }

    @Override
    public List<String> write() {
        List<String> listToWrite = new ArrayList<>();
        listToWrite.add(this.nameOfVideo);
        listToWrite.add(Double.toString(this.lengthOfVideo));
        listToWrite.add(Integer.toString(this.maxResolutionOfVideo));
        listToWrite.add(Double.toString(this.sizeOfVideo));

        return listToWrite;
    }

    @Override
    public void read(List<String> toWriteValues) {
        if(toWriteValues != null && toWriteValues.size() > 0) {
            this.nameOfVideo = toWriteValues.get(0);
            this.lengthOfVideo = Double.parseDouble(toWriteValues.get(1));
            this.maxResolutionOfVideo = Integer.parseInt(toWriteValues.get(2));
            this.sizeOfVideo = Double.parseDouble(toWriteValues.get(3));
        }
    }
}

