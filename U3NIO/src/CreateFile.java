import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) {
        try {
            Path p= Paths.get("C:\\KE001\\test.txt");
            if(Files.exists(p))
                System.out.println("File already exists");
            else {
                Path pp=Files.createFile(p);
                System.out.println("File created..");
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}