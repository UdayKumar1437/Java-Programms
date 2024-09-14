public class test2 {
    public static void main(String[] args) {
        edhokati obj = new edhokati();
        edhokati obj2 = new edhokati(2);
    }
    
}



class edhokati{
    public edhokati()
    {
        System.out.println("I am Running");
    }


    public edhokati(int a)
    {
        System.out.println(a);
    }
}
