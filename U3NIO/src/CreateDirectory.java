import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {
    public static void main(String[] args) {
        try {
            Path p= Paths.get("C:\\KE001");
            if(Files.exists(p))
                System.out.println("Directory already exists");
            else {
                Path pp=Files.createDirectory(p);
                System.out.println("Derectory created..");
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}