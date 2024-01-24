import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second Number: ");
        int b = sc.nextInt();
        //Unary Operators
        //postfix and prefix
        int c = +b;
        System.out.println(c);
        System.out.println(-b);

        //Arithmetic Operator like       * / %         + -
        int s = a+b;
        System.out.println("Sum: " + s);
        

        //Shift Operator
        int x = b>>1;
        System.out.println("Shift: " + x);
        int y = b>>>1;
        System.out.println("Shift: " + y);
        sc.close();
    }
}
