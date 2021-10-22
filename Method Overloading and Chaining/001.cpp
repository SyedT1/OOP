#include <iostream>
using namespace std;
class information
{
private:
    int salary;
    string name;

public:
    information(int x, string y)
    {
        salary = x;
        name = y;
    }
    information the_name()
    {
        cout << name << endl;
        return *this;
    }
    void the_salary()
    {
        cout << salary << endl;
    }
};
int main()
{
    information man1(20000, "K");
    man1.the_name().the_salary();
    return 0;
}
