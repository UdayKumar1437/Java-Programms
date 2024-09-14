public class InterfacesAddon {
    public static void main(String[] args) {
        B obj = new B();
        obj.divya();
    }
}


interface A{
    void pranathi();
    void jyotsna();
}

interface G{
    void divya();
}

interface H extends G
{
    void gayathri();
}

class B implements A,H{
    public void pranathi()
    {
        System.out.println("Pranathi");

    }

    public void jyotsna()
    {
        System.out.println("Jyotsna");
    }

    public void divya()
    {
        System.out.println("Divya");
    }

    public void gayathri()
    {
        System.out.println("Gayathri");
    }
}



// class - class --> extends
// class - interface --> implements
// interface - interface --> extends
