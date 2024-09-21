import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionArrayList {
    public static void main(String[] args) {


        // Collection 

        // List --> ArrayList,LinkedList

        // Queue --> DeQueue

        // Set --> HashSet, LinkedHashSet
        List<Integer> nums = new ArrayList<Integer>(); //[]
        System.out.println(nums);
        nums.add(1); //[1]
        nums.add(22); //[1,22]
        nums.add(32); //[1,22,32]
        // nums.remove(22);
        nums.add(1,222);
        nums.clear();
        System.out.println(nums);
        // System.out.println(nums.indexOf(22));

        // System.out.println(nums);
        // System.out.println(nums.get(1));
        // System.out.println(nums);
        // for(int num:nums)
        // {
        //     System.out.println(num);
        // }
    


       


    }
}
