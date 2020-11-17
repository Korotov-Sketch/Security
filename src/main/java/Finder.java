import java.io.File;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Finder {
    public static void main(String[] args) throws Exception {

        File FirstDirectory = new File("src/main/resources/Test");
        File FirstFile = new File("src/main/resources/Test/T.txt");
        Queue<File> fileTree = new PriorityQueue<>();
        String startFileInBytes = BinReader.readBytes(FirstFile);
        // Path testFilePath;
        // String WayToFjile;
        Collections.addAll(fileTree, FirstDirectory.listFiles());

        while (!fileTree.isEmpty()) {
            File currentFile = fileTree.remove();

            if (currentFile.isDirectory()) {
                Collections.addAll(fileTree, currentFile.listFiles());

            }
            else {
                String curFileInBytes = BinReader.readBytes(currentFile);

                if(curFileInBytes.contains(startFileInBytes)){
                    System.out.println(currentFile.getPath());
                }
            }
        }


    }
}
