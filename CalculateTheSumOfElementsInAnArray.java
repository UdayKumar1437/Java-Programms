public class CalculateTheSumOfElementsInAnArray {
    public static void main(String[] args) {
        // [1,2,3] = 6
        int arr[] = {1,2,3};
        int sum = 0;
        for(int num : arr)
        {
            sum= sum+num;
        }
        System.out.println(sum);
    }
}
