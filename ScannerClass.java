import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int num = sc.nextInt();
        // int ans = 1;
        // for(int i =1;i<=num;i++)
        // {
        //     ans = ans*i;
        // }
        // System.out.println(ans);
        // System.out.println("Enter your name:");
        // String name = sc.nextLine();
        // System.out.println("My Name is "+name);
        // System.out.println("Enter First Number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter a Second Number");
        // int num2 = sc.nextInt();
        // System.out.println(num1+num2);


        int[] nums = new int[4]; //[0,0,0,0] --> [22,33,11,23]
        for(int i =0;i<4;i++)
        {
            nums[i] = sc.nextInt();
        }

        for(int num : nums){
            System.out.print(num+" ");
        }

    }
}
