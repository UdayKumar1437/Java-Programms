public class en {
    public static void main(String[] args) {
        edhokati obj = new edhokati();
        obj.setAge(23);
        obj.setName("Uday");
        obj.setClgName("VSM");

        
    }
}




class edhokati{
    private String name;
    private int age;
    private String clgName;
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
    public String getClgName() {
        return clgName;
    }
    public void setClgName(String clgName) {
        this.clgName = clgName;
    }


    
}