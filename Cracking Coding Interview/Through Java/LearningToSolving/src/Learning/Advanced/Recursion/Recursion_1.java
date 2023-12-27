package Learning.Advanced.Recursion;

import java.util.Scanner;

public class Recursion_1 {
    // Find the factorial of a given number
    int sum(int n) {
        if (n == 0) {
            return 1;
        }
        return n*sum(n-1);
    }

    // Main method
    public static void main(String[] args) {
        // Take the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        Recursion_1 obj = new Recursion_1();
        System.out.println("The factorial of the given number " + n + " is " + obj.sum(n));
    }
}
