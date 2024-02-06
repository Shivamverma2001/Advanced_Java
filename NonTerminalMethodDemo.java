import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NonTerminalMethodDemo {
    public static void main(String[] args) {
        //Non- terminal methods-> filter, map, distinct, limit  ->  return stream of object
        //Terminal methods->  Collect, count, min, max, forEach, toArray

        //Mostly 1st methods are non-terminal methods but not compulsory

        List<String> list=Arrays.asList("car","bike","bus","bike","car","bycle");

        List<String> collect= list.stream()
                                        .distinct() //Non-terminal method
                                        .collect(Collectors.toList());//terminal method
                        
        System.out.println(collect);

        list.stream()
                    .distinct()
                    .forEach(System.out::println);

        long ans=list.stream()
                            .distinct()
                            .count();

        System.out.println(ans);


        list.stream()
                    .limit(3)
                    .forEach(System.out::println);

        List<Integer> list2=Arrays.asList(2,3,4,5,6,7,8,8,9,77,5,4,2);

        long ans2=list2.stream()
                                .filter(e->e%2==0)
                                .count();

        System.out.println(ans2);

        Optional<Integer> ans3=list2.stream()
                                            .min((x,y)->x.compareTo(y));
                    
        System.out.println(ans3.get());


        List<String> list3=Arrays.asList("A","B","C","1","2","3");

        Optional<String> ans4=list3.stream()
                    .reduce((a,b)->a+b);

        System.out.println(ans4.get());

        System.out.println(list2.stream()
                                        .reduce((x,y)->x*y).get());
    }
}
