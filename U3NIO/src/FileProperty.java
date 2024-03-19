import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProperty {
    public static void main(String[] args) {
        Path p= Paths.get("/Users/shivamverma/Documents/Advanced_Java/Dataset");

        System.out.println(p);
        System.out.println(p.getParent());
        System.out.println(p.subpath(0,2));
        System.out.println(p.getName(0));
        System.out.println(p.getRoot());
        System.out.println(Files.exists(p));
    }
}
