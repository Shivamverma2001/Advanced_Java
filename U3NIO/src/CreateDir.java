import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CreateDir {
    public static void main(String[] args) {
        Path p= Paths.get("/Users/shivamverma/Documents/Advanced_Java/Dataset");
        try{
            Stream<Path> stream= Files.list(p);
            stream.forEach(x->{
                String name=x.getFileName().toString();
                String []token=name.split("\\.");
                String extension=token[token.length-1];
                try {
                    Path d=Paths.get(x.getParent()+"/"+extension);
                    Files.createDirectory(d);
                }catch (Exception e){
                    e.printStackTrace();
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
