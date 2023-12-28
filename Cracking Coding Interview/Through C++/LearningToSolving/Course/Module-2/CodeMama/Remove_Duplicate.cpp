#include <iostream>

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

    // Solution to remove the duplicate array value
    for (int i = 0; i < N-1; i++) {
        if (A[i] != 0) {
            for (int j = i+1; j < N; j++) {
                if (A[i] < A[j]) {
                    break;
                } else {
                    if (A[i] == A[j]) {
                        A[j] = 0;
                    }
                }
            }
        }
    }

    int i = 0;
    while(N--) {
        if (A[i] != 0) {
            cout << A[i] << " ";
        }
        i++;
    }

    return 0;
}
