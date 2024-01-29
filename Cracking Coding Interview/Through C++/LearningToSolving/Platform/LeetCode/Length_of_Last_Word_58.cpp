#include <bits/stdc++.h>

using namespace std;

int main() {
    string s;

    // Take user input
    cout << "Enter the string: ";
    getline(cin, s);

    // Solution
    int c = 0;
    for (int i = s.size()-1; i >= 0; i--) {
        if (s[i] == ' ' && c != 0) {
            break;
        }
        else if (s[i] == ' ' & c == 0) {
            continue;
        }
        else {
            c++;
        }
    }

    return 0;
}