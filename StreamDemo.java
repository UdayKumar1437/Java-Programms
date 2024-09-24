import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,1,2,3,4);

        int result = nums.stream().filter(num -> num%2 ==1).map(num -> num*3).reduce(0, (durga,pranathi) -> durga+pranathi);
        System.out.println(result);
        // Stream<Integer> stream1 = nums.stream();
        // Stream<Integer> stream2 = stream1.filter(num -> num%2==1);
        // Stream <Integer> stream3 = stream2.map(num -> num*3);
        // stream3.forEach(con -> System.out.println(con));
    }
}
