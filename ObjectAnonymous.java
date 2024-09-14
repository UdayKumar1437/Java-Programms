public class ObjectAnonymous {
    public static void main(String[] args) {
        // edhokati obj = new edhokati();
        // obj.hi();

        new edhokati().hi();

        // int a = 5 ;
    }
}



class edhokati{
    String name;

    public edhokati() {

        System.out.println("I am default Constructor");
    }
    public void hi()
    {
        System.out.println("Hi Function");
    }

    
}
