import java.util.Scanner;

public class Fibonecci {
    public static void main(String[] args) {
        int a =0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        int series = sc.nextInt();
        System.out.print(a +" "+b);

        int nextValue ;

        for(int i =2;i<series;i++ )
        {
            nextValue = a+b;
            a=b;
            b=nextValue;
            System.out.print(" "+nextValue);
        }
        System.out.println();

    }
}
