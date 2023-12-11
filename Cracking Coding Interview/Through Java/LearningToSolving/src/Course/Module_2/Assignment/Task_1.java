package Course.Module_2.Assignment;

import java.util.Scanner;

public class Task_1 {
    // Solution of the task 1
    void solution() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target number: ");
        int target = sc.nextInt();

        boolean brk = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                    brk = true;
                    break;
                }
            }

            if (brk) {
                break;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Task_1 task1 = new Task_1();
        task1.solution();
    }
}


// Time Complexity : O(N^2)
// Space Complexity : O(N)
