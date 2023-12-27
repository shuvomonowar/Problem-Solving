package Platform.LeetCode.Easy;

public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int l = prices.length, tp = 0, mp = 0, j = 1;
        for (int i = 0; i < l-1; i++) {
            if (j >= l) {
                break;
            }
            else if (prices[i] < prices[j]) {
                tp = prices[j]-prices[i];
                if (tp > mp) {
                    mp = tp;
                }
                j++;
                i--;
            } else {
                tp = prices[j]-prices[i];
                if (tp > mp) {
                    mp = tp;
                }
                i = j-1;
                j++;
            }
        }

        return mp;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        Best_Time_to_Buy_and_Sell_Stock obj1 = new Best_Time_to_Buy_and_Sell_Stock();
        System.out.println(obj1.maxProfit(arr));
    }
}
