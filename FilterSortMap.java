import java.util.Arrays;
import java.util.List;

public class FilterSortMap {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(8,6,7,9,4);

        nums.stream()
                .filter(e->e%2==0)
                .sorted()
                .map(e->e*e)
                .forEach(e->System.out.println(e));
    }
}
