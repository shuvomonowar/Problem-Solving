package Course.Module_4.Assignment;

import java.util.Scanner;

public class Task_2 {
    // Solution of the task 2
    int solution(int a, int b) {
        if (b < 1) {
            return 0;
        }
        return a+solution(a, b-1);
    }

    // Main method
    public static void main(String[] args) {
        // User input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        Task_2 obj1 = new Task_2();
        System.out.println("The result of multiplication: " + obj1.solution(a, b));
    }
}


// Time Complexity : O(n)
// Space Complexity : O(n)
