#include <iostream>
using namespace std;
class ComplexNo
{
    int real, img;
    friend istream &operator>>(istream &in, ComplexNo &a)
    {
        cout << "Enter the real part = ";
        in >> a.real;
        cout << "Enter the img part = ";
        in >> a.img;
        return in;
    }
    friend ostream &operator<<(ostream &out, ComplexNo &a)
    {
        out << a.real << (a.img < 0 ? '-' : '+') << a.img << "i";
        return out;
    }

public:
    void set_real(istream &in)
    {
        cout << "Enter the Real part of the complex Number = ";
        in >> real;
    }
    void set_img(istream &in)
    {
        cout << "Enter the Img part of the complex Number = ";
        in >> img;
    }
    int set_real()
    {
        return real;
    }
    int set_img()
    {
        return img;
    }
};
class MatrixOfComplexNo
{
    int noOfRows;
    int *noOfColsForEachRow;
    ComplexNo **complexRowPtr; // this will point to the pointer of ComplexNo* or arrays of ComplexNo
    // ComplexNo **complexRowPtr
    // 2 row 2 col
    // 2+3i 2+4i
    // 5+2i 6-4i
    friend ostream &operator<<(ostream &out, MatrixOfComplexNo &a)
    {
        for (int i = 0; i < a.noOfRows; i++)
        {
            for (int j = 0; j < a.noOfColsForEachRow[i]; j++)
            {
                out << a.complexRowPtr[i][j] << " ";
            }
            out << endl;
        }
        return out;
    }

public:
    MatrixOfComplexNo()
    {
        noOfRows = 5;
        noOfColsForEachRow = new int[noOfRows];
        for (int i = 0; i < 5; i++)
        {
            noOfColsForEachRow[i] = 5;
        }
    }
    void setMatrix()
    {
        cout << "Enter the # of rows = ";
        cin >> noOfRows;
        noOfColsForEachRow = new int[noOfRows];
        for (int i = 0; i < noOfRows; i++)
        {
            cout << "Enter the # of cols for " + to_string(i) + " th row=" << endl;
            cin >> noOfColsForEachRow[i];
        }

        for (int i = 0; i < noOfRows; i++)
        {
            complexRowPtr[i] = new ComplexNo[noOfColsForEachRow[i]];
            for (int j = 0; j < noOfColsForEachRow[i]; j++)
            {
                cout << "Enter ComplexNo[" + to_string(i) + "]" + "[" + to_string(j) + "] = ";
                cin >> complexRowPtr[i][j];
            }
        }
    }
};
int main()
{
    int n, row;
    MatrixOfComplexNo *matrixPtr;
    cout << "How many matrices of complex nos? ";
    cin >> n;
    matrixPtr = new MatrixOfComplexNo[n];
    for (int i = 0; i < n; i++)
    {
        matrixPtr[i].setMatrix();
    }
    for (int i = 0; i < n; i++)
    {
        cout << matrixPtr[i] << endl;
    }
}