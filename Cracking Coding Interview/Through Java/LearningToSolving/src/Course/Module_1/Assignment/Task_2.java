package Course.Module_1.Assignment;

import java.util.Scanner;

public class Task_2 {
    // Find the sum of all natural numbers between a given range
    void solution() {
        Scanner sc = new Scanner(System.in);

        long a, b, start, end;
        System.out.print("Enter starting number : ");
        a = sc.nextLong();
        System.out.print("Enter last ending number : ");
        b = sc.nextLong();

        // Make sure the starting and ending number
        if (a > b) {
            start = b - 1;
            end = a;
        } else {
            start = a - 1;
            end = b;
        }

        long sum_start, sum_end, sum;
        sum_start = (start * (start + 1)) / 2;
        sum_end = (end * (end + 1)) / 2;

        sum = sum_end - sum_start;
        System.out.println("The sum is " + sum);
    }

    // Main method
    public static void main(String[] args) {
        Task_2 task2 = new Task_2();
        task2.solution();
    }
}


// Time Complexity : O(1)
// Space Complexity : O(1)
