public class SumofNumbersInAGivenRange {
    // start 5 end 10 --> 5+6+7+8+9+10 --> 45
    public static void main(String[] args) {
        int start = 5;
        int end = 10;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("sum of numbers in a given range: " + sum);
    }
}
