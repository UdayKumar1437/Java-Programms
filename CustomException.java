public class CustomException {
    public static void main(String[] args) {

        int i = 20;
        int j = 18;
        int ans;
        try {
            ans = j / i; // 18/20
            // System.out.println(ans);
            if (ans == 0) {
                throw new DivyaException("Sorry the result is Zero");
            }
        } catch (DivyaException e) {
            System.out.println("This is a DivyaException");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I won't listen!");
        }
    }
}

class DivyaException extends RuntimeException{
    public DivyaException(String string)
    {
        super(string);
    }
    public DivyaException()
    {
        
    }
}
