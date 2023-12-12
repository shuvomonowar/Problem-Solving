#include <bits/stdc++.h>

using namespace std;

class Task_2 {
	public:
		// Solve the task-2 assignment
		void solution(int prices[], int size) {
			int temp = 0, j = 0;

            for (int i = 1; i < size; i++) {
                if (prices[i]-prices[j] > temp) {
                    temp = prices[i]-prices[j];
                } else {
                    if (prices[i] > prices[j]) {
                        continue;
                    } else {
                        j = i;
                    }
                }
            }

            cout << temp << "\n";
		}
};


int main() {
    int size;
    cout << "Enter the size the day: ";
    cin >> size;

    int prices[size];
    cout << "Enter the prices list of the days: ";
    for (int i = 0 ; i < size; i++) {
        cin >> prices[i];
    }

	Task_2 obj;
	obj.solution(prices, size);

	return 0;
}


// Time complexity O(N)
// Space Complexity O(N)