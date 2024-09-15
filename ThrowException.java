public class ThrowException {
    public static void main(String[] args) {
        
        int i =20;
        int j = 18;
        int ans;
        try{
            ans = j/i; //18/20
            // System.out.println(ans); 
            if(ans ==0)
            {
                throw new IndexOutOfBoundsException("Sorry the result is Zero");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("This is an Arthemetic exception");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I won't listen!");
        }
    }
}
