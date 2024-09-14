public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.showName();

        A.B obj1 = obj.new B();
        obj1.classBMethod();


    }
}



class A{

    String name ="Anjum";
    int age = 22;
    public void showName()
    {
        System.out.println(name);
    }

    class B{
        public void classBMethod()
        {
            System.out.println("Class B Method");
        }
    }
}