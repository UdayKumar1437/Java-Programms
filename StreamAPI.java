import java.util.*;
import java.util.function.Consumer;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,1,2,3,4);
        // int sum = 0;
        // for(int n : nums)
        // {
        //     if(n%2==1)
        //     {
        //         sum= sum+ n*3;
        //     }
        // }
        // System.out.println(sum);

        // for(int i = 0;i<nums.size();i++)
        // {
        //     System.out.println(nums.get(i));
        // }

        // nums.forEach(n -> System.out.println(n));

        nums.forEach(num ->System.out.println(num));
    }
}
