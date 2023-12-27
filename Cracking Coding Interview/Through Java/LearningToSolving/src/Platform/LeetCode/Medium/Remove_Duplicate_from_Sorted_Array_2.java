package Platform.LeetCode.Medium;

import java.util.Arrays;

import java.lang.Math;

public class Remove_Duplicate_from_Sorted_Array_2 {
    public int removeDuplicates(int[] nums) {
        int t = 0, l = nums.length, r = (int)Math.pow(10, 4), c = 0, k = 0;

        for (int i = 0; i < l-1; i++) {
            if (nums[i] != r) {
                t = 0;
                for (int j = i+1; j < l; j++) {
                    if (nums[i] == nums[j]) {
                        t++;
                        if (t > 1) {
                            nums[j] = r;
                            c++;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        Arrays.sort(nums);
        k = l - c;

        return k;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        Remove_Duplicate_from_Sorted_Array_2 obj1 = new Remove_Duplicate_from_Sorted_Array_2();
        System.out.println(obj1.removeDuplicates(arr));
//        obj1.removeDuplicates(arr);
    }
}
