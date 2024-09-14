public class LargestElementInArray {
    // {33,4,1} == 33
    public static void main(String[] args) {
        int nums[] = {33,4,1};
        int max = nums[0];
        for(int num : nums)
        {
            if(num>max)
            {
                max = num;
            }

        }
        System.out.println(max);
    }
}
