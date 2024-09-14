public class PrimeNumber {
    // 7 -->  2 3 4 5 6 
    public static void main(String[] args) {
        int num = 24;
        int count = 0;
        for(int i =2;i<num;i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }
        if(count ==0)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a prime");
        }

    }
}
