package Platform.LeetCode.Easy;

import java.util.Scanner;

public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        // Remove all whitespaces and alphanumeric characters
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();
        sb.append(s);

        return s.equals(String.valueOf(sb.reverse()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();

        Valid_Palindrome o1 = new Valid_Palindrome();
        System.out.println(o1.isPalindrome(s));
    }
}
