public class Inheritence {
    public static void main(String[] args) {
        VeryPowerfulCalculator obj = new VeryPowerfulCalculator();
        int ans = obj.div(1,2);
        int subAns = obj.sub(5,2);
        System.out.println(ans);
        System.out.println(subAns);
        System.out.println(obj.name);
    }
}
