public class abstraction {
    // Abstraction is the process of hiding the internal implememtation of the function from the user.
    public static void main(String[] args) {
        Calculator obj = new VeryPowerfulCalculator();
        obj.add();
        obj.sub();
    }
}



abstract class Calculator{
    public abstract void add();

    public void sub()
    {
        System.out.println("Subtraction Method");
    }
}


abstract class AdvancedCalcultor extends Calculator{
    public void add(){
        System.out.println("Addition method");
    }

    public abstract void div();
    public void mul()
    {
        System.out.println("Multiplication");
    }
}

class veryAdvancedCalculator extends AdvancedCalcultor{
    public void div()
    {
        System.out.println("Division method");
    }
    
}



// Abstract method --> no need to define the body
// if there is a Abstract method the class also should be the abstract class
// if any class is inherited from abstract class in the sub class we should define the body of abstract methods.
// we can not create object for the abstract class