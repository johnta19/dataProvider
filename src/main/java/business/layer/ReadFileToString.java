package business.layer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileToString {

    String fileName = "src/main/resources/searchItem";
    String contents;

    {
        try {
            contents = readUsingFiles(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
    public String readFile() throws IOException {
        return contents = readUsingFiles(fileName);
    }

}
