//Swapping of two number without using third variable.

import java.util.Scanner;

public class swap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.println("Before Swapping: ");
        System.out.println("a = "+ a);
        System.out.println("B = "+ b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping: ");
        System.out.println("a = "+ a);
        System.out.println("B = "+ b);
        sc.close();
    }
}
