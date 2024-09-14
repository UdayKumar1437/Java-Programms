public class Strlength {
    public static void main(String[] args) {
        String name = "Padma";
        int count = 0;
        for(char a:name.toCharArray())
        {
            count++;
        }
        System.out.println(count);
    }
}
