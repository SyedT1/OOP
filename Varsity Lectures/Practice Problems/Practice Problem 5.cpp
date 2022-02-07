#include <iostream>
using namespace std;
class HardDisk
{
    int rpm, capacityInGB;
    friend istream &operator>>(istream &in, HardDisk &a)
    {
        cout << "Enter rpm = ";
        cin >> a.rpm;
        cout << "Enter capacity in GB = ";
        cin >> a.capacityInGB;
        return in;
    }
    friend ostream &operator<<(ostream &out, HardDisk &a)
    {
        out << "RPM :" << a.get_rpm() << " and it's capacity(in GB) " << a.get_capacityInGB();
        return out;
    }

public:
    int get_rpm()
    {
        return rpm;
    }
    int get_capacityInGB()
    {
        return capacityInGB;
    }
};
class Computer
{
    string brand;
    float speedInGhz;
    int noOfHDD;
    HardDisk *hddArr;
    float price;
    friend istream &operator>>(istream &in, Computer &a)
    {
        cout << "Enter Brand = ";
        in >> a.brand;
        cout << "Enter speedInGhz = ";
        in >> a.speedInGhz;
        cout << "Enter noOfHDD = ";
        in >> a.noOfHDD;
        a.hddArr = new HardDisk[a.noOfHDD];
        for (int i = 0; i < a.noOfHDD; i++)
        {
            in >> a.hddArr[i];
        }
        cout << "Enter Price = ";
        in >> a.price;
        return in;
    }
    friend ostream &operator<<(ostream &out, Computer &a)
    {
        out << "Brand Name is = " << a.brand << endl;
        out << "Speed in GhZ = " << a.speedInGhz << endl;
        out << "No of HDD = " << a.noOfHDD << endl;
        for (int i = 0; i < a.noOfHDD; i++)
        {
            out << "HDD#" << i + 1 << ":" << a.hddArr[i] << endl;
        }
        out << "Its Price = " << a.price << endl;
        return out;
    }

public:
    int getTotalStorage()
    {
        int sum = 0;
        for (int i = 0; i < noOfHDD; i++)
        {
            sum += hddArr[i].get_capacityInGB();
        }
        return sum;
    }
};
class ComputerLab
{
    string roomNo;
    int noOfComputer;
    Computer *compArr;
    friend int operator+=(int &x, ComputerLab &a)
    {
        for (int i = 0; i < a.noOfComputer; i++)
        {
            x += a.compArr[i].getTotalStorage();
        }
        return x;
    }
    friend bool operator>=(ComputerLab a, int x)
    {
        return a.noOfComputer >= x;
    }

public:
    ComputerLab &setLabInfo()
    {
        cout << "Enter the roomNo:";
        cin >> roomNo;
        cout << "Enter the noOfComputers:";
        cin >> noOfComputer;
        compArr = new Computer[noOfComputer];
        for (int i = 0; i < noOfComputer; i++)
        {
            cout << "Enter the Details for computer # " << i + 1 << endl;
            cin >> compArr[i];
        }
        return *this;
    }
    void showLabInfo()
    {
        cout << "The Room No. for the lab: " << roomNo << endl;
        cout << "The # of Computer for the Lab = " << noOfComputer << endl;
        for (int i = 0; i < noOfComputer; i++)
        {
            cout << "Details of the Computer No # " << i + 1 << endl;
            cout << compArr[i] << endl;
        }
    }
};
int main()
{
    ComputerLab *labs;
    int n, i;
    cout << "How many computer labs? ";
    cin >> n;
    labs = new ComputerLab[n];
    int totalStorageofAllLabsinGB = 0;
    for (i = 0; i < n; i++)
    {
        cout << "Set info for Lab #" << i + 1 << endl;
        labs[i].setLabInfo().showLabInfo();
        totalStorageofAllLabsinGB += labs[i];
        if (labs[i] >= 30)
        {
            cout << i << "-th Lab is a big computer Lab" << endl;
        }
        else
        {
            cout << i << "-th Lab is a small computer Lab." << endl;
        }
    }
    cout << "Total storage of all Labs combined is = " << totalStorageofAllLabsinGB << endl;
    return 0;
}