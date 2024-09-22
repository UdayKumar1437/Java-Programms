import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistinctElementsInAnArray {
  public static void main(String[] args) {
        // [1,2,1,2,1,1,4,5,6]
        // 1--> 4 2 --> 2 4-->1 5 -->1 6 -->1

        ArrayList<Integer> nums = new ArrayList<Integer>();
        Map<Integer, Integer> ans = new HashMap<Integer,Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(1);
        nums.add(4);
        nums.add(5);
        nums.add(6);

        
        for(int num:nums)
        {
            if(ans.keySet().contains(num))
            {
                ans.put(num, ans.get(num)+1);
            }
            else{
                ans.put(num, 1);
            }
        }
        for(int keys: ans.keySet())
        {
            if(ans.get(keys) == 1)
            {
                System.out.println(keys);
            }
        }
    }   
}
