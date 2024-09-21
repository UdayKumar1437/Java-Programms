import java.util.*;

public class RemoveDuplicateElementsInAnArray {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>(); //[1,2,23]
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(23);
        nums.add(23);
        for(int num:nums)
        {
            if(ans.contains(num))
            {
                ans.add(num);
            }
        }
        System.out.println(ans);
    }
}
