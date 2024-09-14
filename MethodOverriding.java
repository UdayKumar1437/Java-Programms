public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.Ab();
    }
}


class C {
    public void Ab()
    {
        System.out.println("In Class C");
    }
}

class A extends C{
    public void Ab()
    {
        System.out.println("In Class A");
    }

    public void Cd()
    {
        System.out.println("In class A CD");
    }
}


class B extends A{
    public void Ab()
    {
        System.out.println("In Class B");
    }
}
