package Platform.LeetCode.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RansomNote_383 {
    // Solution method
    public boolean canConstruct(String ransomNote, String magazine) {
        int cnt = 0;
        if (ransomNote.length() <= magazine.length()) {
            ArrayList<Character> mar = new ArrayList<>();
            HashMap<Character, Integer> msh = new HashMap<>();

            for (int i = 0; i < magazine.length(); i++) {
                mar.add(magazine.charAt(i));
            }

            for (int i = 0; i < magazine.length(); i++) {
                msh.putIfAbsent(magazine.charAt(i), Collections.frequency(mar, mar.get(i)));
            }

            for (int i = 0; i < ransomNote.length(); i++) {
                char c = ransomNote.charAt(i);
                if (msh.containsKey(c)) {
                    cnt++;
                    msh.put(c, msh.get(c)-1);
                    if (msh.get(c) == 0) {
                        msh.remove(c);
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }

        return cnt == ransomNote.length();
    }

    // Main method
    public static void main(String[] args) {
        RansomNote_383 obj = new RansomNote_383();
        System.out.println(obj.canConstruct("aa", "aad"));
    }
}
