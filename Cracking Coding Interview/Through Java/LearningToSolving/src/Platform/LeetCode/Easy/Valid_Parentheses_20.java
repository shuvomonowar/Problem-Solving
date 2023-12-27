package Platform.LeetCode.Easy;

import java.util.Stack;

public class Valid_Parentheses_20 {
    // Solution method
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        char c;
        int sz = s.length();

        if (sz > 1 && sz%2 == 0) {
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);

                if (c == '(') {
                    parentheses.push(')');
                }
                else if (c == '{') {
                    parentheses.push('}');
                }
                else if (c == '[') {
                    parentheses.push(']');
                }
                else {
                    if (!parentheses.isEmpty() && parentheses.peek() == c) {
                        parentheses.pop();
                    } else {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }

         return parentheses.isEmpty();
    }


    // Main method
    public static void main(String[] args) {
        Valid_Parentheses_20 obj = new Valid_Parentheses_20();
        System.out.println(obj.isValid("("));
    }
}
