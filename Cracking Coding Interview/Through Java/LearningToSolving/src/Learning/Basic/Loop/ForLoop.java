package Learning.Basic.Loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // Print the all odd numbers between two given numbers
        Scanner sc = new Scanner(System.in);
        int start, end;
        System.out.print("Enter starting number: ");
        start = sc.nextInt();
        System.out.print("Enter ending number: ");
        end = sc.nextInt();

        while (start <= end) {
            if (start % 2 != 0) {
                System.out.print(start + " ");
            }
            start++;
        }
    }
}
