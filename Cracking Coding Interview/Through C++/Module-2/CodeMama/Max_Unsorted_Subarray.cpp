#include <bits/stdc++.h>

using namespace std;

int main() {
    // Taking the array size from user
    int N;
    cin >> N;

    // Taking the array list from the user
    int A[N];
    for (int i = 0; i < N; i++) {
        cin >> A[i];
    }

    // Find the starting and ending index of the largest subarray from the array
    int high = 0, tmp = 0, cnt = 0, s = 0, e = 0, t = 0;
    for (int i = 0; i < N-1; i++) {
        if (A[i] <= A[i+1]) {
            t++;
            if (t > tmp) {
                tmp = t;
                e = i+1;
                s = e-t;
            }
        } else {
            if (t > tmp) {
                e = i;
                s = e-t;
            }      
            t = 0;
            cnt++;
        }
    }

    if (cnt != 0) {
        cout << s << " " << e << "\n";
    } else {
        cout << -1 << "\n";
    }
    

    return 0;
}