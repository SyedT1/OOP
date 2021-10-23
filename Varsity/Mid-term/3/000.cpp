#include <iostream>
#include <cstdlib>
using namespace std;
class Array
{
    int *dataPtr;
    int noOfElements;
    float avg;

public:
    void set_noOfElements(int x)
    {
        noOfElements = x;
    }
    void set_values(int mx)
    {
        dataPtr = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++)
        {
            dataPtr[i] = rand() % 10;
        }
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
    void get_elements()
    {
        cout << "{";
        for (int j = 0; j < noOfElements; j++)
        {
            cout << dataPtr[j];
            if (j < noOfElements - 1)
                cout << ',';
        }
        cout << "}"
             << "" << avg << endl;
    }

public:
};

class ArrayOfArrays
{
    Array *ptrToArrays;
    int noOfArrays;

public:
    ArrayOfArrays setArrayOfArrays(int x, int mx)
    {
        noOfArrays = x;
        cout << "Size of obj. noOfArrays is randomly set to: " << x << endl;
        cout << "Upper limit of random values is " << mx << endl;
        ptrToArrays = new Array[noOfArrays];
        for (int i = 0; i < noOfArrays; i++)
        {
            int ran = rand() % 10;
            cout << "Size of the Array of obj. ptrToArrays [" << i << "] is randomly set to: " << ran << endl;
            ptrToArrays[i].set_noOfElements(ran);
            ptrToArrays[i].set_values(ran);
            ptrToArrays[i].average();
        }
        return *this;
    }
    ArrayOfArrays showArrayofArrays()
    {
        for (int i = 0; i < noOfArrays; i++)
        {
            ptrToArrays[i].get_elements();
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
