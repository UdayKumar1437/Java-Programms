public class FriendlyPair {
    public static void main(String[] args) {
        int num1 =30;
        int num2 = 196;

        int num1Sum = getFactorsSum(num1);
        int num2Sum = getFactorsSum(num2);

        System.out.println(num1Sum/num1+"" +num2Sum/num2);
        if(num1Sum/num1 == num2Sum/num2)
        {
            System.out.println("Friendly pair");
        }
        else{
            System.out.println("Not a Friendly pair");
        }

    }



    public static int getFactorsSum(int num)
    {
        int sum =0;
        for(int i =1;i<num;i++)
        {
            if(num%i==0)
            {
                sum =sum+i;
            }
        }
        return sum;

    }
}
