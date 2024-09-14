class Student{
    String name;
    String phoneNumber;
    static String CollegeName;

    public void showInfo(){
        System.out.println(name + " " + phoneNumber + " " +CollegeName);
    }

    public static void showInfo1()
    {
        System.out.println("in static function");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Vidya Sree";
        student1.phoneNumber = "345678987654";
        // Student.CollegeName = "Pydah";

        Student student2 = new Student();
        student2.name = "Pranathi";
        student2.phoneNumber = "4567898765434567";
        Student.CollegeName = "Pydah";

        student1.showInfo();
        student2.showInfo();
        // Student.showInfo1();
    }
}
