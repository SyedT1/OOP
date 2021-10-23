#include <iostream>
#include <cstdlib>
#include <sstream>
#include <limits>

using namespace std;
class Player
{
private:
    string name;
    int assigned_tasks;
    int check_assignments;
    string *tasks;
    bool unassigned = true;

public:
    string get_name()
    {
        return name;
    }
    void set_name(string s)
    {
        name = s;
    }
    Player show_name()
    {
        cout << name << endl;
        return *this;
    }
    Player assignment_status()
    {
        if (check_assignments > 0 || (unassigned == false))
        {
            cout << "Defaulter\n";
        }
        else
        {
            cout << "Complete or Unassigned\n";
        }
        return *this;
    }
    Player set_assignments(int x)
    {
        unassigned = false;
        check_assignments = assigned_tasks = x;
        tasks = new string[x];
        cout << "What assignments do you want to assign Mr." << name << endl;
        for (int i = 0; i < x; i++)
        {
            string line;
            getline(cin, line);
            cin.ignore(std::numeric_limits<std::streamsize>::max(), cin.widen('\n'));
            tasks[i] = line;
        }
        return *this;
    }
    int get_num_of_assigned()
    {
        return assigned_tasks;
    }
    Player show_assignments()
    {
        for (int i = 0; i < assigned_tasks; i++)
        {
            cout << tasks[i] << endl;
        }
        return *this;
    }
};
class Coach
{
private:
    int assigned_players = 0;
    Player *arr;

public:
    Coach number_of_assigned_players()
    {
        cout << "Total assigned players = " << assigned_players << endl;
        return *this;
    }
    Coach set_assignment(int n)
    {
        arr = new Player[n];
        assigned_players = n;
        for (int i = 0; i < n; i++)
        {
            cout << "the name of the player to assign task = " << endl;
            string l;
            cin >> l;
            arr[i].set_name(l);
            cout << "How many tasks do you want to assign him?\n";
            int num_tasks;
            cin >> num_tasks;
            arr[i].set_assignments(num_tasks);
        }
        return *this;
    }
    Coach view_all_assignments()
    {
        for (int i = 0; i < assigned_players; i++)
        {
            arr[i].show_assignments();
        }
        return *this;
    }
};
int main()
{
    Coach Mac;
    int ran_val;
    cin >> ran_val;
    Mac.set_assignment(ran_val).view_all_assignments();
}
