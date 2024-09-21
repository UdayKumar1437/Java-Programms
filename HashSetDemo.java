import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(1);
        nums.add(22);
        nums.add(33);
        nums.add(22);
        nums.add(33);
        nums.add(67);

        Iterator<Integer> values = nums.iterator();
        while(values.hasNext())
        {
            System.out.println(values.next());
        }

        // for(int num:nums)
        // {
        //     System.out.println(num);
        // }
    }
}


// [1,2,3,1]
// [1,2,3]