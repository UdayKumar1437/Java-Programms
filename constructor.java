public class constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj2 = new Human();
        Student obj3 = new Student();
        // Constructor is a function ..... Constructor will be called itself whenever an object is created

    }
}


class Human{
    public Human()
    {
        System.out.println("I am A Constructor function");
    }
}

class Student{
    public Student()
    {
        System.out.println("I am Student class constructor");
    }
}