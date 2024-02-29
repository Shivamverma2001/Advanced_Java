import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
    String name;
    String phoneNo;
    int age;
    int marks1;
    int marks2;
    int marks3;
    Student(String name,String phoneNo,int age,int marks1,int marks2,int marks3){
        this.name=name;
        this.phoneNo=phoneNo;
        this.age=age;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", phoneNo=" + phoneNo + ", age=" + age + ", marks1=" + marks1 + ", marks2="
                + marks2 + ", marks3=" + marks3 + "]";
    }

}
public class Prac {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
            new Student("John", "9876543210", 15, 85, 90, 95),
            new Student("Jane", "1234567890", 16, 92,19, 8),
            new Student("Alice", "0987654321",  17, 95, 10,9),
            new Student("Bob", "1111111111", 16,18,21,19));
        
        studentList.stream().forEach(s->System.out.println(s));

        
        System.out.println(studentList.stream()
                    .sorted((x,y)->x.marks1>y.marks1?-1:1)
                    .filter(s->s.age>15)
                    .map(s->s.marks1*2)
                    .reduce((x,y)->x+y));

        System.out.println(studentList.stream()
                            .max((x,y)->x.age>y.age?1:-1));
    }
}
