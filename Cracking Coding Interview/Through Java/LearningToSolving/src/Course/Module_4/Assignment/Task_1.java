package Course.Module_4.Assignment;

import java.util.Scanner;

public class Task_1 {
    // Solution of the task 1
    // Find the palindrome
    String solution(String s, int n) {
        // Base case
        if (n < 0) {
            return "";
        }

        // Recursive case
        return s.charAt(n)+solution(s, n-1);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int n = s.length();

        // Create the object
        Task_1 task1 = new Task_1();

        if (s.equals(task1.solution(s, n-1))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}


// Time Complexity : O(n)
// Space Complexity : O(n)
