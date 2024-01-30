import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        str.forEach(x->System.out.print(x+" "));

        //filter
        Stream<Integer> s1= al.stream();

        System.out.println(s1.filter(n->n%2==0).collect(Collectors.toList()));

        //or

        // List<Integer> collect1= s1.filter(n->n%2==0).collect(Collectors.toList());
        // System.out.println(collect1);

        Stream<Integer> s2=al.stream();
        System.out.println(s2.filter(n->n>5).collect(Collectors.toList()));

        String name[]={"Shivam","Himanshu","Parth","Harshad","Rajput"};

        List<String> ls = Stream.of(name).collect(Collectors.toList());
        Stream<String> s3=Arrays.stream(name);
        Stream<String> s4=Stream.of(name);

        System.out.println(ls);
        System.out.println(s4.toList());
        System.out.println(s3.toList());

        Stream<Object> emptyStream=Stream.empty();
        emptyStream.forEach(e->{
            System.out.println(e);
        });
        
        IntStream s5=Arrays.stream(new int[]{1,2,3,4,5,6,7,8});
        s5.forEach(e->{
            System.out.print(e+" ");
        });
        System.out.println();


        //map

        Stream<Integer> s6=al.stream();
        System.out.println(s6.map(n->n*2).collect(Collectors.toList()));

        //min or max
        System.out.println(al.stream().min((x,y)->x.compareTo(y)).get());
        System.out.println(al.stream().max((x,y)->x.compareTo(y)).get());
        
    }
}