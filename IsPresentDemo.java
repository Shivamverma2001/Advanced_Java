import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class IsPresentDemo {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(15,5,25,35,15,10);

        Optional<Integer> reduce=list.stream()
                .filter(e->e%2==1)
                .reduce((x,y)->x+y);
        
        if(reduce.isPresent()){
            System.out.println("The sum of odd numbers is: "+reduce.get());
        }else{
            System.out.println("There are no odd numbers in the list");
        }
    }
}
