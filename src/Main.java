import com.fileSystem.*;
import com.fileSystem.FileManager;

public class Main {
    public static void main(String[] args) {

        FileEntity[] files = {
            new FileEntity("file.txt", 1024, "2022-01-01", 5),
            new FileEntity("manager.txt", 512, "2022-02-15", 8),
            new FileEntity("about.txt", 2048, "2022-03-20", 3)
        };

        FileManager fileManager = new FileManager(files);

        fileManager.displayFilesSortedByName();

        long maxSize = 1000;
        fileManager.displayFilesAboveSize(maxSize);

        int minAccessCount = 4;
        fileManager.displayFilesAboveAccessCount(minAccessCount);
    }
}