public class Final {
    public static void main(String[] args) {
        // final int num = 23;
        // num = 21;
        // System.out.println(num);



        B obj = new B();
        obj.check();

    }
}
final class A{
    final public void check()
    {
        System.out.println("A check");
    }
}

class B extends A{
    // public void check()
    // {
    //     System.out.println("B check");
    // }
}