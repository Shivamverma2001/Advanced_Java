import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteToFileAppend {
    public static void main(String[] args) {

        try {
            Path p = Paths.get("C:\\KE001\\test1.txt");
            String data="\n We are learing Adv Java programming\n" +
                    "After learming this\n" +
                    "We will get placment in good MNC \n";
            Files.write(p,data.getBytes(),StandardOpenOption.APPEND);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}