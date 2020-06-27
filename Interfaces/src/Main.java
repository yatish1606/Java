import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        saveObject(interfaceObject);
        loadObject(interfaceObject);


    }

    public static void saveObject(Saveable objectToSave) {
        System.out.println("\nCycling through all items...");
        for(int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Storing item " + objectToSave.write().get(i) + " to local storage");
            System.out.println((i+1) + " of " + objectToSave.write().size());
        }
    }

    public static void loadObject(Saveable objectToLoad) {
        List<String> listToRead = new ArrayList<>();
        System.out.println("Type 'exit' to exit else enter data");

        Scanner input = new Scanner(System.in);
        String itemToAdd = "";
        boolean exit = false;
        while(!exit) {
            itemToAdd = input.nextLine();
            listToRead.add(itemToAdd);
            System.out.println(itemToAdd);
            if(itemToAdd.equals("exit")) {
                exit = true;
                break;
            }
        }
        System.out.println("Input stored successfully.");
        objectToLoad.read(listToRead);
    }
}
