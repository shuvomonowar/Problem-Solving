#include <iostream>

using namespace std;

int main() {
    int arr[] = {1, 2, 3, 4, 5};

    for (int i : arr) {
        cout << i << " ";
    }

    cout << "\n";

    for (auto i : arr) {
        cout << i << " ";
    }

    return 0;
}