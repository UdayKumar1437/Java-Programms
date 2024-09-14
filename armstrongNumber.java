import java.lang.Math;

public class armstrongNumber {
 public static void main(String[] args) {
    int start = 100;
    int end = 1000;
    for(int i = start;i<=end;i++)
    {
        isArmstrong(i);
    }
 }

 public static void isArmstrong(int num)
 {
    int temp = num;
    int dummy = num;
    int ans = 0;
    int rem;
    int l = 0;
    while(dummy !=0)
    {
        rem = dummy%10;
        l++;
        dummy = dummy/10;
    }
    while(num !=0)
    {
        rem = num%10;
        ans  = ans +(int) Math.pow(rem,l);
        num = num/10;
    }
    if(ans == temp)
    {
        System.out.println(temp);
    }
 }
}
