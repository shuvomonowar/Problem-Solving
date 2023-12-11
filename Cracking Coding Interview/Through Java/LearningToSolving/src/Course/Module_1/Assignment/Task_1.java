package Course.Module_1.Assignment;

import java.util.Scanner;

public class Task_1 {
    // Find the factorial of a given number
    void solution() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input number: ");
        int input_number = sc.nextInt();

        int result = 1;
        while (input_number > 1) {
            result *= input_number;
            input_number--;
        }

        System.out.println("The result of factorial is " + result);
    }

    // Main method
    public static void main(String[] args) {
        Task_1 task1 = new Task_1();
        task1.solution();
    }
}


// Time Complexity : O(n)
// Space Complexity : O(1)
