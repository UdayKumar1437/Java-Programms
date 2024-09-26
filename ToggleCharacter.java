public class ToggleCharacter {
    public static void main(String[] args) {
        String s = "udaY KuMAr";
        String ans = ""; //UDAy kUmaR
        for(int i =0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                ans = ans+Character.toLowerCase(s.charAt(i));
            }
            else{
                ans = ans+Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
