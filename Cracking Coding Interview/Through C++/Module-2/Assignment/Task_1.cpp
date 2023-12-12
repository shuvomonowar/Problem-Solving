#include <bits/stdc++.h>

using namespace std;

class Task_1 {
	public:
		// Solve the task-1 assignment
		void solution(int nums[], int size, int target) {
			bool brk = false;
			for (int i = 0; i < size-1; i++) {
				for (int j = 0; j < size; j++) {
					if (nums[i]+nums[j] == target) {
						cout << "[" << i << "," << j << "]" << "\n";
						brk = true;
						break;
					}
				}

				if (brk) {
					break;
				}
			}
		}
};


int main() {
	int size;
	cout << "Enter array size: ";
	cin >> size;

	int nums[size];
	cout << "Enter the elements of the array: ";
	for (int i = 0; i < size; i++) {
		cin >> nums[i];
	}

	int target;
	cout << "Enter the target value: ";
	cin >> target;


	Task_1 obj;
	obj.solution(nums, size, target);

	return 0;
}


// Time complexity O(N^2)
// Space Complexity O(N)