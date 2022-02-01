#include <iostream>
using namespace std;
class ComplexNo
{
    int real, img;

public:
    void setvalues()
    {
        cout << "Enter the real part = " << endl;
        cin >> real;
        cout << "Enter the imaginary part = " << endl;
        cin >> img;
    }
    int getReal()
    {
        return real;
    }
    int getImg()
    {
        return img;
    }
    ComplexNo operator+(ComplexNo a)
    {
        ComplexNo temp;
        temp.real = real + a.real;
        temp.img = img + a.img;
        return temp;
    }
    ComplexNo operator+(int val)
    {
        ComplexNo temp;
        temp.real = real + val;
        temp.img = img;
        return temp;
    }
};
ostream &operator<<(ostream &out, ComplexNo a)
{
    out << a.getReal();
    if (a.getImg() != 0)
    {
        out << (a.getImg() < 0 ? '-' : '+')<<a.getImg()<<'i';
    }
    return out;
}
int main()
{
    ComplexNo a, b;
    a.setvalues();
    b.setvalues();
    cout << a << endl;
    cout << a + b << endl;
}