import java.util.*;
import java.util.stream.Collectors;

public class StreamInterfaceDemo2 {
    public static void main(String[] args) {
        List<Integer> number=Arrays.asList(1,2,3,4,5,6);
        List<Integer> square=number.stream().map(x->x*x).collect(Collectors.toList());

        System.out.println(square);
        System.out.println(number);
    }
}
