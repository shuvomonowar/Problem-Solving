package Platform.LeetCode.Medium;

public class Rotate_Array_189 {
    // Solution method
    public void rotate(int[] nums, int k) {
        int ptemp;
        for (int i = 0; i < k; i++) {
            ptemp = nums[nums.length-1];
            int temp = nums[0];
            for (int j = 1; j < nums.length; j++) {
                int ftemp = nums[j];
                nums[j] = temp;
                temp = ftemp;
            }
            nums[0] = ptemp;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        Rotate_Array_189 obj = new Rotate_Array_189();
        obj.rotate(nums, k);
    }
}
