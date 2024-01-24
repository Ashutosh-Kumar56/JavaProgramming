//Proram to convert Binary Number into Decimal Number.

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int p = 1;
        System.out.print("Enter a Binary Number: ");
        int n = sc.nextInt();
        while (n!=0) {
            int r = n%10;
            n = n/10;
            s = s + r * p;
            p = p*2;
        }
        System.out.println("Decimal No.: " + s);
        sc.close();
    }
}
