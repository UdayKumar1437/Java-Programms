public class SecondConstructor {

    public static void main(String[] args) {
        // Human obj = new Human();
        // obj.show();
        // Human obj1 = new Human("Uday",24);
        // obj1.show();
        Human obj2 = new Human(24);
        obj2.show();
    }
}


class Human{

    String name ;
    int age;

    public Human() {
    }

    public Human(int age) {
        this.age = age;
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
