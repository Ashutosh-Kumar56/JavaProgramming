import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a=obj.nextInt();

        System.out.print("Enter 2nd number: ");
        int b=obj.nextInt();

        System.out.println("Sum of a and b is:" +(a+b));

    obj.close();    
    }
}
