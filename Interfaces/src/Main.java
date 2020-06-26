import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> toWriteValuesForTextFile = new ArrayList<>();
        toWriteValuesForTextFile.add("File name");
        toWriteValuesForTextFile.add("1");
        toWriteValuesForTextFile.add("2.78");

        List<String> toWriteValuesForAudioFile = new ArrayList<>();
        toWriteValuesForAudioFile.add("Six Feet Under");
        toWriteValuesForAudioFile.add("4.56");
        toWriteValuesForAudioFile.add("Billie Eilish");

        List<String> toWriteValuesForVideoFile = new ArrayList<>();
        toWriteValuesForVideoFile.add("DIY");
        toWriteValuesForVideoFile.add("3.56");
        toWriteValuesForVideoFile.add("1080");
        toWriteValuesForVideoFile.add("3.21");

        Saveable interfaceObject;

        // Text file
        interfaceObject = new TextFile("Important files", 10, 2.56);;
        System.out.println(interfaceObject.write());
        interfaceObject.read(toWriteValuesForTextFile);
        System.out.println(interfaceObject.toString());

        System.out.println("\n=========================\n");

        // Audio files
        interfaceObject = new AudioFile("Name of song", 3.56, "Singer");
        System.out.println(interfaceObject.write());
        interfaceObject.read(toWriteValuesForAudioFile);
        System.out.println(interfaceObject.toString());

        System.out.println("\n=========================\n");

        // Video files
        interfaceObject = new VideoFile("GOT S8 | Official Trailer", 2.12, 1080, 6.87);
        System.out.println(interfaceObject.write());
        interfaceObject.read(toWriteValuesForVideoFile);
        System.out.println(interfaceObject.toString());

        
    }
}
