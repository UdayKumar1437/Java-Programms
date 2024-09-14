public class ExceptionHandling {
    public static void main(String[] args) {
        // System.out.Println("Divya");
        // System.out.println(10+2);


        int a = 0;
        int b = 22;
        int[] nums = new int[5];
        try{
            int ans = b/2;
            System.out.println(ans);
            // System.out.println(nums[7]);
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong "+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You crossed your limit!");
        }
        catch(Exception e){
            System.out.println("Something went wrong!");
        }
        finally{
            System.out.println("I'm sitayya!!!");
        }


    }
}


// Error 
// Run time Error
// compile time Error
// logical error
