#include <iostream>
using namespace std;
class Date
{
    int day, year;
    string month;

public:
    void set_day()
    {
        cout << "Enter Day:";
        cin >> day;
    }
    void set_month()
    {
        cout << "Enter Month:";
        cin >> month;
    }
    void set_year()
    {
        cout << "Enter Year:";
        cin >> year;
    }
    int get_day()
    {
        return day;
    }
    string get_month()
    {
        return month;
    }
    int get_year()
    {
        return year;
    }
};
class Employee
{
    int employeeID;
    string name, department;
    Date dateOfJoining;
    friend istream &operator>>(istream &in, Employee &a)
    {
        cout << "Enter name :";
        in >> a.name;
        cout << "Enter employeeID :";
        in >> a.employeeID;
        cout << "Enter Department :";
        in >> a.department;
        a.dateOfJoining.set_day();
        a.dateOfJoining.set_month();
        a.dateOfJoining.set_year();
        return in;
    }
    friend ostream &operator<<(ostream &out, Employee a)
    {
        out << "The name is : " << a.name << endl;
        out << "ID is: " << a.employeeID << endl;
        out << "Dept is " << a.department << endl;
        out << "Date of joining is = " << a.dateOfJoining.get_day() << ' ' << a.dateOfJoining.get_month() << a.dateOfJoining.get_year() << endl;
        return out;
    }
    friend bool operator==(Employee a, int y)
    {
        return a.dateOfJoining.get_year() == y ? true : false;
    }
    friend bool operator==(Employee a, string s)
    {
        return a.dateOfJoining.get_month() == s ? true : false;
    }

public:
    Employee() {}
    Employee(int ID, string n, string dept) : employeeID{ID}, name{n}, department{dept}
    {
        dateOfJoining.set_day();
        dateOfJoining.set_month();
        dateOfJoining.set_year();
    }
    string getName()
    {
        return name;
    }
    int getID()
    {
        return employeeID;
    }
    string getDept()
    {
        return department;
    }
};
int main()
{
    Employee e1, e2(4161, "S K Dey", "CSE");
    cout << "Give input for employee 1: " << endl;
    cin >> e1;
    cout << "Complete information of the employees are = " << endl;
    cout << e1 << e2 << endl;
    cout << "Mr/Mrs. " << e1.getName() << endl;
    if ((e1 == 2017) && (e1 == "October"))
    {
        cout << "Joined the company in Oct 17" << endl;
    }
    else
    {
        cout << "Didn't join the company in Oct 17" << endl;
    }
}