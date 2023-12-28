#include <bits/stdc++.h>

using namespace std;

class Task_1 {
    public:
        // Solution method
        string solution(string s, int n) {
            if (n < 0) {
                return "";
            }

            return s[n] + solution(s, n - 1);
        }
};

// Main method
int main() {
    string s;

    // Take the user input
    cout << "Enter the sting: ";
    getline (cin, s);

    int n = s.size();

    // Object instantiation
    Task_1 obj;
    string fs = obj.solution(s, n-1);

    // Print the final result
    if (s == fs) {
        cout << "true\n";
    } else {
        cout << "false\n";
    }

    return 0;
}


/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
