public class Inheritencetest {
    public static void main(String[] args) {
        uday obj = new uday();
        obj.divya1();
    }
}



class divya{
    public void divya1()
    {
        System.out.println("divya");
    }
}


class uday extends divya{
    public void uday1()
    {
        System.out.println("uday");
    }
}
