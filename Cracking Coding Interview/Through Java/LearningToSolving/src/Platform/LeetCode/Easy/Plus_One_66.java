package Platform.LeetCode.Easy;

import java.util.Arrays;

public class Plus_One_66 {
    // Solution method
    public int[] plusOne(int[] digits) {
        // Solution-1
        /*String s = "";
        for (int i = 0; i < digits.length; i++) {
            s = s.concat(String.valueOf(digits[i]));
        }

        BigInteger n = new BigInteger(s);
        n = n.add(BigInteger.ONE);

        s = String.valueOf(n);
        int[] fdigits = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            fdigits[i] = Character.getNumericValue(s.charAt(i));
        }

        return fdigits;*/

        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        digits = new int[digits.length+1];
        digits[0] = 1;

        return digits;
    }

    // Main method
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        Plus_One_66 obj = new Plus_One_66();
        System.out.println(Arrays.toString(obj.plusOne(digits)));
    }
}
