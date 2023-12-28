#include <iostream>

using namespace std;

class Task_2 {
    public:
        // Solution method
        int solution(int cns, int cng) {
            if (cng < 1) {
                return 0;
            }

            return cns + solution(cns, cng - 1);
        }
};

// Main method
int main() {
    int a, b, cns, cng;

    // Take the user input
    cout << "Enter the first number: ";
    cin >> a;
    cout << "Enter the second number: ";
    cin >> b;

    if (a > b) {
        cns = a;
        cng = b;
    } else {
        cns = b;
        cng = a;
    }

    // Object instantiation
    Task_2 obj;
    int fr = obj.solution(cns, cng);

    // Print the final result
    cout << "The result of multiplication of " << a << " and " << b << " : " << fr << "\n";

    return 0;
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/