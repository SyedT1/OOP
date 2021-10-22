#include <iostream>
using namespace std;
class Caretaker
{
    int tips_earned = 0;

public:
    Caretaker &bring_food()
    {
        tips_earned += 10;
        cout << "Food brought\n";
        return *this;
    }
    Caretaker &serve_food()
    {
        tips_earned += 10;
        cout << "Food served\n";
        return *this;
    }
    Caretaker &lok(){
        tips_earned += 10;
        cout<<"Done\n";
        return *this;
    }
    void tps_status()
    {
        cout << "Total earned = " << tips_earned << endl;
    }
};
int main()
{
    Caretaker K;
    K.bring_food().lok().serve_food();
    K.tps_status();
}
