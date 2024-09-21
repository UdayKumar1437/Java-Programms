public class ThreadClass  {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        objA.start();
        objB.start();
    }
}

class A extends Thread{
    public void run()
    {
        for(int i = 0 ; i<=50;i++)
        {
            System.out.println("Uday");
        }
    }
}


class B extends Thread{
    public void run()
    {
        for(int i = 0 ; i<=50;i++)
        {
            System.out.println("Kumar");
        }
    }
}