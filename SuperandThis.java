public class SuperandThis {
    public static void main(String[] args) {
        B obj = new B(5);
        obj.pranathi();
    }
}



class A{
    public A()
    {
        this(5);
        System.out.println("In Constructor A");
    }
    public A(int n){
        super();
        System.out.println("In Constructor A Int");
    }

    public void pranathi()
    {
        System.out.println("I am pranathi");
    }
}

class B extends A{
    public B()
    {
        super();
        System.out.println("In Constructor B");
    }
    public B(String name)
    {
        this();
        System.out.println("In constructor B String");
    }
    public B(int n){
        this("uday");
        System.out.println("In Constructor B Int");
    }
}


// In constructor b --> b int