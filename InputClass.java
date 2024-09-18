import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number");


        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        System.out.println(number);

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);

        // int num = Integer.parseInt(br.readLine());
        // System.out.println(num);
        // int number = System.in.read();
        // System.out.println(number - 48);
    }
}
