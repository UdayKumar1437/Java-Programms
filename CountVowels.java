public class CountVowels {
    
    public static void main(String[] args) {
        String name = "Padma";
        String vowels = "aeiouAEIOU";
        int count = 0;
        for(String a:name.split(""))
        {
            if(vowels.contains(a)){
                count++;
            }
        }
        System.out.println(count);
    }
}


