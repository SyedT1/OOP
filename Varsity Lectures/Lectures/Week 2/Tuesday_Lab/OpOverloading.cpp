#include <iostream>
using namespace std;
class ComplexNo
{
    int real, img;

public:
    ComplexNo(int x, int y) : real{x}, img{y} {}
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
        return ComplexNo{real + a.real, img + a.img};
    }
    ComplexNo operator+(int val)
    {
        return ComplexNo{real + val, img};
    }
};
ostream &operator<<(ostream &out, ComplexNo a)
{
    out << a.getReal();
    if (a.getImg() != 0)
    {
        out << (a.getImg() < 0 ? '-' : '+') << a.getImg() << 'i';
    }
    return out;
}
int main()
{
    ComplexNo a{0, 0}, b{0, 0};
    a.setvalues();
    b.setvalues();
    cout << a << endl;
    cout << a + b << endl;
}