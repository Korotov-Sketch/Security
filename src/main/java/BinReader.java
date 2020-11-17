import java.io.File;
import java.io.FileInputStream;

public class BinReader {
    public static String readBytes(File way) throws Exception {
        FileInputStream inputStream = new FileInputStream(way);
        int byteOfData = inputStream.read();
        StringBuilder BytesOfWords = new StringBuilder();

        while(byteOfData != -1) {
            BytesOfWords.append(byteOfData);
            byteOfData = inputStream.read();
        }

        return BytesOfWords.toString();
    }
}
