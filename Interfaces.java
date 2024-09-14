public class Interfaces {
    public static void main(String[] args) {
        // A obj = new B();
        // obj.display();
        // obj.divya();

        A obj = new A() {
            public void display() {
                System.out.println("I am displaying");
            }

            public void divya() {
                System.out.println("I am divya!");
            }
        };

        obj.display();
        obj.divya();

    }
}

interface A {

    String clgNAme = "pydah"; // Varibles --> they are static and constant --> final
    int age = 23;

    void display();

    void divya();
}

// class B implements A{
// public void display()
// {
// System.out.println("I am displaying");
// }

// public void divya()
// {
// System.out.println("I am divya!");
// }
// }

// Rename abstract class to interface
// we can remove public abstract to the methods
// rename extends to implements
