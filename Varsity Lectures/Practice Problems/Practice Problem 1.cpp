#include <iostream>
using namespace std;
class Address
{
private:
    int houseNo, roadNo, zipCode;
    string street, thana, district;

public:
    void set_houseNo()
    {
        cout << "Enter HouseNo:";
        cin >> houseNo;
    }
    void set_roadNo()
    {
        cout << "Enter RoadNo:";
        cin >> roadNo;
    }
    void set_zipCode()
    {
        cout << "Enter ZipCode:";
        cin >> zipCode;
    }
    void set_street()
    {
        cout << "Enter Street:";
        cin >> street;
    }
    void set_thana()
    {
        cout << "Enter Thana:";
        cin >> thana;
    }
    void set_district()
    {
        cout << "Enter District:";
        cin >> district;
    }
    int get_houseNo() { return houseNo; }
    int get_roadNo() { return roadNo; }
    int get_zipCode() { return zipCode; }
    string get_district() { return district; }
    string get_thana() { return thana; }
    string get_street() { return street; }
};
class Employee
{
    int employeeID;
    string name, department;
    Address empAdress;
    friend istream &operator>>(istream &in, Employee &a)
    {
        cout << "Enter Name:";
        in >> a.name;
        cout << "Enter Department:";
        in >> a.department;
        cout << "Enter ID:";
        in >> a.employeeID;
        a.empAdress.set_district();
        a.empAdress.set_zipCode();
        a.empAdress.set_thana();
        a.empAdress.set_street();
        a.empAdress.set_houseNo();
        a.empAdress.set_roadNo();
        return in;
    }
    friend ostream &operator<<(ostream &out, Employee a)
    {
        int max_len = max(a.department.length(), max(to_string(a.employeeID).length(), a.name.length()));
        out << "       Name:" << string(max_len - a.name.length(), ' ') << a.name << endl;
        out << "Employee ID:" << string(max_len - to_string(a.employeeID).length(), ' ') << a.employeeID << endl;
        out << " Department:" << string(max_len - a.department.length(), ' ') << a.department << endl;
        out << "Residence information shown below:" << endl;
        out << "House #:" << a.empAdress.get_houseNo() << endl;
        out << "Road  #:" << a.empAdress.get_roadNo() << endl;
        out << "Street #:" << a.empAdress.get_street() << endl;
        out << "District #:" << a.empAdress.get_district() << endl;
        out << "ZipCode#:" << a.empAdress.get_zipCode() << endl;
        return out;
    }
    friend bool operator==(Employee &a, int x)
    {
        if (a.empAdress.get_zipCode() == x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

public:
    Employee() {}
    Employee(int ID, string employeeName, string dept) : employeeID{ID}, name{employeeName}, department{dept}
    {
        empAdress.set_district();
        empAdress.set_zipCode();
        empAdress.set_thana();
        empAdress.set_street();
        empAdress.set_houseNo();
        empAdress.set_roadNo();
    }
    void setID(int x)
    {
        employeeID = x;
    }
    void setName(string name)
    {
        this->name = name;
    }
    void setDept(string name)
    {
        department = name;
    }
};
int main()
{
    Employee e1, e2(1111, "Human", "CS");
    cout << "Give Input for Employee 1:" << endl;
    cin >> e1;
    cout << e1 << e2 << endl;
    cout << "The employee e1 ";
    if (e1 == 1229)
    {
        cout << "lives in Bashundhara" << endl;
    }
    else
    {
        cout << "does Not live in Bashundhara" << endl;
    }
}