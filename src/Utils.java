import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<String> readInput(String filename) {
        List<String> input = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("src/" + filename + ".txt")));

            String line;

            while ((line = reader.readLine()) != null) {
                input.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }
}
