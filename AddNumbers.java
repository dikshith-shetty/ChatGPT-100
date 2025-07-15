// Add two numbers

import java.util.Scanner;

public class AddNumbers {
    /* This method will take two integer parameters a and b
     * and will return sum of two integer a and b.
     */
    public static int add(int a, int b) {
        return a+b;
    }

    /* Main method to start the program. which takes the input from user in console.
     * Write the sum of integer a and b to the console.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer a: "); // remote edit 1
        int a = sc.nextInt();
        System.out.println("Enter the integer b: ");
        int b = sc.nextInt();
        System.out.println("Addition of the integer a and b result is: " + add(a,b));
    }
}
