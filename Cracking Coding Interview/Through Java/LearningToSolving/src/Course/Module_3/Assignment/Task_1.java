package Course.Module_3.Assignment;

import java.util.Scanner;

public class Task_1 {
    // Solution of the task 1
    void solution(String s, int[] indices) {
        String fs = "";
        for (int i = 0; i < indices.length; i++) {
            fs  = fs.concat(String.valueOf(s.charAt(indices[i])));
        }

        System.out.println(fs);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int n = s.length();
        int[] indices = new int[n];
        System.out.print("Enter the indices: ");
        for (int i = 0; i < n; i++) {
            indices[i] = sc.nextInt();
        }

        Task_1 task1 = new Task_1();
        task1.solution(s, indices);
    }
}


// Time Complexity : O(N)
// Space Complexity : O(N)
