package Services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class Text_Reader {
    public String readFile(String filePath) throws IOException {
        StringBuilder text = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ( (line = reader.readLine()) != null) {
                text.append(line).append("\s");
            }
        }
        return text.toString();
    }
}
