public class RemoveSpaces {
    public static void main(String[] args) {
        String s = "Pranathi Durga";
        String ans = "";
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) != ' ')
            {
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
