package Platform.LeetCode;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] arr  = {1, 2, 2, 2, 3, 3, 4, 5, 5};

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != 101) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] != 101) {
                        if (arr[i] == arr[j]) {
                            arr[j] = 101;
                        }
                    }
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 101) {
                cnt++;
            }
        }

        Arrays.sort(arr);

        /*int itr = arr.length - cnt;

        for (int i = 0; i < itr; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] == 101) {
                    for (int k = j+1; k < arr.length; k++) {
                        int temp = arr[k];
                        arr[k] = arr[k-1];
                        arr[k-1] = temp;
                    }
                }
            }
        }*/

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
