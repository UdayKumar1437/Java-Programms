import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        // int sum = 0;
        // for(int num:nums)
        // {
        //     sum= sum+num;
        // }
        // System.out.println(sum);

        int result = nums.stream().reduce(2, (c,e)->c+e);
        System.out.println(result);
    }
}
