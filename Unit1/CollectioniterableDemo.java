import java.util.ArrayList;

class Student{
    String name;
    String cityName;

    public Student(String name,String cityName){
        this.name=name;
        this.cityName=cityName;
    }
    public String toString(){
        return "Student Name : "+name+"\nCity Name : "+cityName;
    }
}
public class CollectioniterableDemo {
    public static void main(String[] args) {
        ArrayList<Student> ls=new ArrayList<>();

        ls.add(new Student("Shivam verma","Yamunanagar"));
        ls.add(new Student("Himanshu", "Muzaffarnagar"));
        ls.add(new Student("Parth", "Kanpur"));

        java.util.Iterator<Student> it=ls.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }

        System.out.println("for Each loop");

        ls.forEach(s->System.out.println(s.toString()));
    }
    
}
