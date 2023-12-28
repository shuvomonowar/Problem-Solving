#include <iostream>

using namespace std;

class Hello
{
    public:
        void show() 
        {
            cout << "Hello World!\n";
        }
};


int main()
{
    Hello obj;
    obj.show();

    return 0;
}