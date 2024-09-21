import java.util.*;

public class RemoveDup {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        Set<Integer> ans = new HashSet<Integer>();
        nums.add(1);
        nums.add(22);
        nums.add(33);
        nums.add(67);
        nums.add(1);
        nums.add(22);
        System.out.println("My Array before removing Duplicates "+nums);
        for(int num:nums)
        {
            ans.add(num);
        }
        System.out.println("My Array after removing Duplicates "+ans);

    }
}
