#include <bits/stdc++.h>

using namespace std;

class Task_1 {
	public:
    	int removeDuplicates(vector<int>& nums) {
    		int c = 0;

        	for (int i = 0; i < nums.size()-1; i++) {
        		if (nums.at(i) != 101) {
        			for (int j = i + 1; j < nums.size(); j++) {
        				if (nums.at(i) == nums.at(j)) {
        					nums.at(j) = 101;
        					c++;
        				}
        			}
        		}
        	}

        	int k = nums.size() - c;
        	sort(nums.begin(), nums.end());

        	return k;
    	}
};


int main() {
	vector<int> nums = {1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 7};

	Task_1 obj;
    cout << obj.removeDuplicates(nums) << "\n";

	return 0;
}