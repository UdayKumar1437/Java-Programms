public class OOPS {
    public static void main(String[] args) {
        Anjum obj = new Anjum();
        obj.getName();

    }
}


abstract class Pranathi{
    public abstract void getName();
}

abstract class Divya extends Pranathi{
    public void getName()
    {
        System.out.println("Divya");
    }

    public abstract void getClgName();
}

class Anjum extends Divya{
    public void getClgName()
    {
        System.out.println("Pydah");
    }
}






// class Divya{
//     public void name()
//     {
//         System.out.println("Divya");
//     }
// }


// class Uday extends Divya{
//     public void name()
//     {
//         System.out.println("Uday");
//     }
// }

// class Divya{
//     public void divya()
//     {
//         System.out.println("Empty params");
//     }
//     public void divya(int a)
//     {
//         System.out.println("Int a");
//     }
//     public void divya(String s)
//     {
//         System.out.println("String S");
//     }
//     public void divya(int a, String s)
//     {
//         System.out.println("Int and String");
//     }
//     public void divya(int a,int b)
//     {
//         System.out.println("Both int");
//     }
// }


// class A{
//     public void show()
//     {
//         System.out.println("A");
//     }
// }


// class B extends A{ 
//     public void ShowB()
//     {
//         System.out.println("B");
//     }
// }

// class C extends B{

// }


// class Jyotsna{
//     private String name = "Jyostna";
//     private String clgName = "Pydah";
//     private String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getClgName() {
//         return clgName;
//     }
//     public void setClgName(String clgName) {
//         this.clgName = clgName;
//     }

    
// }
