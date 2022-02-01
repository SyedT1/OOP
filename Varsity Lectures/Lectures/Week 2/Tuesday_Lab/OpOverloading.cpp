#include <iostream>
using namespace std;
class ComplexNo
{
    double real, img;

public:
    ComplexNo(double x, double y) : real{x}, img{y} {}
    void setvalues()
    {
        cout << "Enter the real part = " << endl;
        cin >> real;
        cout << "Enter the imaginary part = " << endl;
        cin >> img;
    }
    double getReal()
    {
        return real;
    }
    double getImg()
    {
        return img;
    }
    ComplexNo operator+(ComplexNo a)
    {
        return ComplexNo{real + a.real, img + a.img};
    }
    ComplexNo operator+(double val)
    {
        return ComplexNo{real + val, img};
    }
    ComplexNo operator*(ComplexNo b)
    {
        return ComplexNo{real * b.real - (img * b.img), real * b.img + img * b.real};
    }
    ComplexNo operator*(double cons)
    {
        return ComplexNo{real * cons, img * cons};
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
    cout << a * b << endl;
}