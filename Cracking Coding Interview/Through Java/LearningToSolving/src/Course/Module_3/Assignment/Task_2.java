package Course.Module_3.Assignment;

import java.util.Scanner;

public class Task_2 {
    // Solution of the task 2
    public int solution(String h, String n) {
        int s = h.indexOf(n);

        return s;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the haystack string: ");
        String h = sc.nextLine();
        System.out.print("Enter the needle string: ");
        String n = sc.nextLine();

        Task_2 obj1 = new Task_2();
        System.out.println(obj1.solution(h, n));
    }
}


// Time Complexity : O(1)
// Space Complexity : O(1)
