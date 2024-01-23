import java.util.ArrayList;
import java.util.stream.*;


public class StreamInterfaceDemo {

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();

        al.add(5);
        al.add(10);
        al.add(19);
        al.add(12);
        al.add(5);
        al.add(10);
        al.add(50);
        al.add(9);

        Stream<Integer> str=al.stream();

        //str.forEach(x->System.out.println(x));

        str=str.distinct().sorted();
        System.out.println("After distinct and sorted method call");
        System.out.println(al);
        str.forEach(x->System.out.println(x));
    }
}