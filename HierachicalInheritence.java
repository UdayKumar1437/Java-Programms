public class HierachicalInheritence {
    public static void main(String[] args) {
        B obj = new B();
        obj.pranathi();
    }
}



class A{
    public void check()
    {
        System.out.println("B Check");
    }
    public void pranathi()
    {
        System.out.println("Pranathi");
    }
}


class B extends A{
    public void check()
    {
        System.out.println("B Check");
    }
}

class C extends A{
    public void check()
    {
        System.out.println("B Check");
    }
}


class D extends A{
    public void check()
    {
        System.out.println("B Check");
    }
}