#include <iostream>
using namespace std;
class Employee
{
private:
    int salary;
    int *tasks, num_tasks = 0;

public:
    int bonus = 0;
    Employee set_tasks(int n)
    {
        tasks = new int[n];
        for (int i = 0; i < n; i++)
        {
            cin >> tasks[i];
        }
        return *this;
    }
    Employee &set_salary(int x)
    {
        salary = x;
        return *this;
    }
    Employee &add_bonus(int y)
    {
        bonus += y;
        return *this;
    }
    Employee &overtime(int z)
    {
        bonus += z;
        return *this;
    }
    void display_overall()
    {
        cout << "Bonus achieved = " << bonus << endl;
    }
};
int main()
{
    Employee mac;
    mac.set_salary(199).add_bonus(3).overtime(10).display_overall();
}
