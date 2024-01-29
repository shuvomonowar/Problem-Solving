package Learning.DataStructure.Array;

import java.util.ArrayList;

public class ArrayList_1 {

    public static void main(String[] args) {
        // Simple implementation of array list

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Shakib");
        arr.add("Tamim");
        arr.add("Mashrafe");

        for (int i = 0; i < arr.size()-1; i++) {
            System.out.print(arr.get(i) + ", ");
        }

        System.out.println(arr.get(arr.size()-1));
    }
}