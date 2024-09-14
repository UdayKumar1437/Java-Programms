public class SingleInheritence {
    public static void main(String[] args) {
        D obj = new D();
        obj.check();
    }
}

class A{
    public void check()
    {
        System.out.println("A check");
    }
}
class B extends A{
    public void check()
    {
        System.out.println("B Check");
    }
}
class C extends B{
    public void check()
    {
        System.out.println("C Check");
    }
}
class D extends C{
    public void check()
    {
        System.out.println("D Check");
    }
}