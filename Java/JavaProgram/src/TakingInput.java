import java.util.Scanner;
// here java is a library
//      util is a package
//      Scanner is a class

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String str = sc.next();         //next() is used because we are taking string as input.
        System.out.print("Enter Your Roll No.: ");
        int num_1 = sc.nextInt();      //nextInt() is used because we are taking integer as input.
        System.out.print("Enter Your section: ");
        char ch = sc.next().charAt(0);      //here we are taking next() for taking string and charAt() for cut off the character and it that as input
        System.out.println("Name: " + str);
        System.out.println("Roll No.: "+ num_1);
        System.out.println("Section: "+ ch);
        sc.close();
    }

}
