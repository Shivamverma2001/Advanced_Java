import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile {
    public static void main(String[] args) {

        try {
            Path p = Paths.get("C:\\KE001\\test1.txt");
            Path pp= Files.createFile(p);
            String data="We are learing Adv Java programming\n" +
                    "After learming this\n" +
                    "We will get placment in good MNC \n";
            Files.write(pp,data.getBytes());
            System.out.println("Data written into Files");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}