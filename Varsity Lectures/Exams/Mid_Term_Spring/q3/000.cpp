#include <iostream>
#include <cstdlib>
using namespace std;
class Array
{
    int *dataPtr;
    int noOfElements;
    float avg;

public:
    Array &set_noOfElements(int x)
    {
        noOfElements = x;
        return *this;
    }
    Array &set_values(int mx)
    {
        dataPtr = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++)
        {
            dataPtr[i] = rand() % 10;
        }
        return *this;
    }

    void average()
    {
        float sum = 0;
        for (int i = 0; i < noOfElements; i++)
        {
            sum += dataPtr[i];
        }
        sum /= double(noOfElements);
        avg = sum;
    }
    int get_noOfElements()
    {
        return noOfElements;
    }
    float get_avg()
    {
        return avg;
    }
    int getArrel(int pos)
    {
        return dataPtr[pos];
    }

public:
};
ostream &operator<<(ostream &out, Array &a)
{
    out << "{";
    for (int j = 0; j < a.get_noOfElements(); j++)
    {
        out << a.getArrel(j);
        if (j < a.get_noOfElements() - 1)
            out << ',';
    }
    out << "}"
        << "" << a.get_avg() << endl;
    return out;
}
class ArrayOfArrays
{
    Array *ptrToArrays;
    int noOfArrays;

public:
    ArrayOfArrays &setArrayOfArrays(int x, int mx)
    {
        noOfArrays = x;
        cout << "Size of obj. noOfArrays is randomly set to: " << x << endl;
        cout << "Upper limit of random values is " << mx << endl;
        ptrToArrays = new Array[noOfArrays];
        for (int i = 0; i < noOfArrays; i++)
        {
            int ran = rand() % 10;
            cout << "Size of the Array of obj. ptrToArrays [" << i << "] is randomly set to: " << ran << endl;
            ptrToArrays[i].set_noOfElements(ran).set_values(ran).average();
        }
        return *this;
    }
    ArrayOfArrays showArrayofArrays()
    {
        for (int i = 0; i < noOfArrays; i++)
        {
            cout << ptrToArrays[i];
        }
        return *this;
    }
    float getAvgofAvgs()
    {
        float sum = 0;
        for (int i = 0; i < noOfArrays; i++)
        {
            sum += ptrToArrays[i].get_avg();
        }
        sum /= double(noOfArrays);
        return sum;
    }
};
int main()
{
    ArrayOfArrays obj;
    int n = rand() % 10, max = 100;
    obj.setArrayOfArrays(n, max).showArrayofArrays();
    cout << "Average of averages of All Arrays : " << obj.getAvgofAvgs() << endl;
    return 0;
}