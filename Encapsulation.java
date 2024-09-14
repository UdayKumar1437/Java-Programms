class Student1{
    private String name;
    private int age;

    public Student1()
    {
        System.out.println("Ok");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // Getters Setters
}


public class Encapsulation {
    // Encapsulation is the process of binding the data and corresponding methods into the single unit.
    public static void main(String[] args) {
        Student1 stu1 = new Student1();
        stu1.setAge(23);
        Student1 stu2 = new Student1();
        stu2.setName("Durga");
        System.out.println(stu1.getAge());
    }
}
