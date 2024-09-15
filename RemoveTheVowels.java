public class RemoveTheVowels {
    public static void main(String[] args) {
        String str = "Navya"; //Nvy
        String vowels = "aeiouAEIOU";
        String ans = "";
        for(int i =0;i<str.length();i++)
        {
            if(!vowels.contains(String.valueOf(str.charAt(i))))
            {
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
