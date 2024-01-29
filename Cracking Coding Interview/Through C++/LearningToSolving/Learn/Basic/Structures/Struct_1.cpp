#include <iostream>
#include <limits>

using namespace std;

// C++ Structures Concept
struct Person
{
    string name;
    int age;
    string address;
};


int main() {
    Person p1;
    cout << "Enter name: ";
    getline(cin, p1.name);
    cout << "Enter age: ";
    cin >> p1.age;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    cout << "Enter address: ";
    getline(cin, p1.address);

    cout << "Person-1 Details: \n";
    cout << "-----------------\n";
    cout << p1.name << '\n';
    cout << p1.age << '\n';
    cout << p1.address << '\n';

    return 0;
}