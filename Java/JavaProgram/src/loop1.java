//Program to count number of digits in a number.
import java.util.Scanner;


public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        while (x!=0) {
            x = x / 10;
            s++;
        }
        System.out.println(s);
        sc.close();
    }
}
