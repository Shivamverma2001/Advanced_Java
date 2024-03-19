import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadDataFromFile {
    public static void main(String[] args) {

        try {
            Path p = Paths.get("C:\\KE001\\test1.txt");
            List<String> ls=Files.readAllLines(p);
            for(String s:ls)
                System.out.println(s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}