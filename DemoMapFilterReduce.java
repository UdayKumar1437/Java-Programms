import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoMapFilterReduce {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11,22,3,1,3,4,5,2);
        // Stream<Integer> ans  = nums.stream().map(n->n*2);
        Stream <Integer> ans = nums.stream().filter(n->n>1).sorted();

        ans.forEach(n->System.out.println(n));

        // int result = nums.stream().reduce(0, (c,e)->{
        //     System.out.println("c"+c);
        //     System.out.println("e"+e);
        //    return c+e;
        // });
        // System.out.println(result);
    }
}
