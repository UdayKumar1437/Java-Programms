public class Polymorphism {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int res = obj.add(3,5);
        System.out.println(res);
    }
}

class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add() {
        return 0;
    }

    public int add(int n1)
    {
        return n1;
    }

}

// Method Overloading --> same function/method name but different in parameters
// Method Over riding