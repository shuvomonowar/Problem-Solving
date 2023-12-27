package Platform.LeetCode.Easy;

public class Sqrt_x_69 {
    public int mySqrt(int x) {
        for (int i = 1; i <= x; i++) {
            if (i*i == x) {
                return i;
            }
            else if (i*i > x) {
                return i-1;
            }
        }

        if (x == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Sqrt_x_69 obj = new Sqrt_x_69();
        System.out.println(obj.mySqrt(1));
    }
}
