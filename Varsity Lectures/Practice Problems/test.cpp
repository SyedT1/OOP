#include <iostream>
using namespace std;
void call(string s)
{
    cout << "String is called" << endl;
}
void call(const char *s)
{
    cout << "Const called" << endl;
}
int main()
{
    string s = "melo";
    call(s);
    call("hello");
}