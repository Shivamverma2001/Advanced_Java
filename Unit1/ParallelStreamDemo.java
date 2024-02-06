import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

class Student{

    private String name;
    private int score;

    public Student(String name,int score){
        this.name = name;
        this.score=score;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setScore(int score){
        this.score=score;
    }
    public String toString(){
        return this.name+" "+this.score;
    }
}

public class ParallelStreamDemo {
    /*
     * Stream
     *      1) Sequential Stream
     *                          A) Non Terminal stream ->    filter, map, distinct, sort, limit
     *                          B) Terminal stream     ->    foreach, collect
     * 
     *      2) Parallel Stream   reduce
     *              Methods
     *                      A) parallel()
     *                      B) parallelStream()
     *                      C) from sequential -> parallel
     */
    public static void main(String[] args) {

        IntStream is=IntStream.range(1, 10);
        IntStream ps=IntStream.range(1, 10);

        //Sequential Stream
        is.forEach(System.out::print);
        System.out.println();

        //Parallel Stream
        ps.parallel().forEach(System.out::print);
        
        List<Student> students=Arrays.asList(
                                new Student("John",95),
                                new Student("Alice",87),
                                new Student("Bob",63),
                                new Student("Tom",92));

        // top 3 student  Sequential
        students.stream()
                        .filter(e->e.getScore()>=75)
                        .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                        .limit(3)
                        .forEach(System.out::println);
                
        // top 3 student  Parallel
        students.stream()
                        .parallel()     
                        .filter(e->e.getScore()>=75)
                        .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                        .limit(3)
                        .forEach(System.out::println);
    }
}
