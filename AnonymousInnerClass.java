public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void display() {
                System.out.println("I'm displaying in new Class!!");
            }
        };
        obj.display();
    }
}

class A {
    public void display() {
        System.out.println("I'm displaying in class A!!");
    }
}

// class B extends A{
// public void display()
// {
// System.out.println("I'm displaying in class B!!");
// }
// }