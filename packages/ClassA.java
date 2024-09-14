public class ClassA{
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}

class A{
    private int age = 23;

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    private void display()
    {
        System.out.println("display");
    }
}

class B {

}