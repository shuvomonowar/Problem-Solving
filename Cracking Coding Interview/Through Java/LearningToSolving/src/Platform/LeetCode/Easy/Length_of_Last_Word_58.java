package Platform.LeetCode.Easy;

import java.util.Scanner;

public class Length_of_Last_Word_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        // Main Solution
        int cnt = 0;
        if (s.charAt(s.length()-1) != ' ') {
            for (int i = s.length()-1; i >= 0; i--) {
                if (s.charAt(i) == ' ') {
                    break;
                }
                cnt++;
            }
        } else {
            for (int i = s.length()-1; i >= 0; i--) {
                if (s.charAt(i) != ' ') {
                    for (int j = i; j >= 0; j--) {
                        if (s.charAt(j) == ' ') {
                            break;
                        }
                        cnt++;
                    }
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
