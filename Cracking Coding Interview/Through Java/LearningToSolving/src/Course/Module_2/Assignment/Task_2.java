package Course.Module_2.Assignment;

import java.util.Scanner;

public class Task_2 {
    // Solution of the task 2
    public int solution(int[] prices) {
        int l = prices.length, tp = 0, mp = 0, j = 1;
        for (int i = 0; i < l-1; i++) {
            if (j >= l) {
                break;
            }
            else if (prices[i] < prices[j]) {
                tp = prices[j]-prices[i];
                if (tp > mp) {
                    mp = tp;
                }
                j++;
                i--;
            } else {
                tp = prices[j]-prices[i];
                if (tp > mp) {
                    mp = tp;
                }
                i = j-1;
                j++;
            }
        }

        return mp;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Task_2 obj1 = new Task_2();
        System.out.println(obj1.solution(arr));
    }
}


// Time Complexity : O(N)
// Space Complexity : O(N)
