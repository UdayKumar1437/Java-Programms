class Pranathi{
    // datatype varName = value
    // firstName, lastName
    private String firstName;
    private String lastName;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    

}

public class classTest {
    public static void main(String[] args) {
        Pranathi obj = new Pranathi();
        obj.setFirstName("Padma Sri");
        obj.setLastName("Nunna");
        String ans = obj.getLastName();
        System.out.println(ans);
    }
}

