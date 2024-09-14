public class AbstractInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void display()
            {
                System.out.println("I am displaying!");
            }

            public void divya()
            {
                System.out.println("I am divya");
            }
        };
        obj.display();
        obj.divya();
    }
}


abstract class A{
    public abstract void display();
    public abstract void divya();
}

// class B extends A{
//     public void display()
//     {
//         System.out.println("I am displaying!");
//     }
// }
