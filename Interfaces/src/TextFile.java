import java.util.ArrayList;
import java.util.List;

public class TextFile implements Saveable {
    private String fileName;
    private int fileLength;
    private double fileSize;

    public TextFile(String fileName, int fileLength, double fileSize) {
        this.fileName = fileName;
        this.fileLength = fileLength;
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return ("File Name : " + this.fileName + "\nFile Length : " + fileLength + "\nFile Size : " + this.fileSize);
    }

    @Override
    public void read(List<String> valuesToWrite) {
        if(valuesToWrite != null && valuesToWrite.size() > 0) {
            this.fileName = valuesToWrite.get(0);
            this.fileLength = Integer.parseInt(valuesToWrite.get(1));
            this.fileSize = Double.parseDouble(valuesToWrite.get(2));
        }
    }

    @Override
    public List<String> write() {
        List<String> listToWrite = new ArrayList<String>();

        listToWrite.add(this.fileName);
        listToWrite.add(Integer.toString(this.fileLength));
        listToWrite.add(Double.toString(this.fileSize));

        return listToWrite;
    }
}
