public class PalindromeString {
    public static void main(String[] args) {
        String s = "level";
        String ans = "";//mujnA
        for(int i =0;i<s.length();i++)
        {
            ans = s.charAt(i)+ans;
        }
        System.out.println(ans.equals(s));

    }
}
