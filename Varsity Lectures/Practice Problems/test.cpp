#include <iostream>
#include <limits>
using namespace std;
int main()
{
    int n;
    cin >> n;
    cin.ignore();
    string s;
    getline(cin, s);
    cin.ignore();
    string l;
    getline(cin, l);
    int o;
    cin >> o;
    cout << n << ' ' << s << ' ' << l << ' ' << o << endl;
}