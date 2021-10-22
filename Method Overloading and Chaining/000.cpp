#include <iostream>
using namespace std;
class ComplexNo
{
private:
    int real, img;

public:
// we see overloading because of the unique parameter list
// the first method uses two parameters and the second method doesn't use any
    ComplexNo(int x, int y)
    {
        real = x;
        img = y;
    }
    ComplexNo()
    {
        cout << "R = ";
        cin >> real;
        cout << "I = ";
        cin >> img;
    }
    void Showreal()
    {
        cout << "Real part of the number is = " << real << endl;
    }
    void Showimg()
    {
        cout << "Imaginary part of the number is = " << img << endl;
    }
};
int main()
{
    /*
      If i wanted to initialize the number with values i would do
      such :
      ComplexNo one{val1,val};*/
    ComplexNo one;  // Manually moves to the second method
    one.Showreal();
    one.Showimg();
}
