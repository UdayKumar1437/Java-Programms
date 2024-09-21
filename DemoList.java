import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<4;i++)
        {
            int num = sc.nextInt();
            nums.add(i,num);
        }
        nums.add(9999999);
        int max = nums.get(0);
        for(int num:nums)
        {
            if(num>max)
            {
                max = num;
            }
        }
        System.out.println(max);
    }
}
