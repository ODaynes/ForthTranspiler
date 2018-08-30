import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileIO {

    public static String getFileAsString(String filename) throws IOException {

        String line;
        String result = "";

        FileReader reader = new FileReader(filename);
        BufferedReader br = new BufferedReader(reader);

        while((line = br.readLine()) != null) {
            result += line;
        }

        br.close();
        reader.close();

        return result;
    }

    public static void writeStringToFile(String path, String contents) throws IOException {

        FileWriter writer = new FileWriter(path);
        writer.write(contents);
        writer.close();

    }

}
