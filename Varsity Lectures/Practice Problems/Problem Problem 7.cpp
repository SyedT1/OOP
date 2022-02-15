#include <iostream>
using namespace std;
class ComplexNo
{
    int real, img;
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
istream &operator>>(istream &in, ComplexNo &a)
{
    a.set_real(in);
    a.set_img(in);
    return in;
}
class MatrixOfComplexNo
{
    int noOfRows;
    int *noOfColsForEachRow;
    ComplexNo *complexRowPtr[];
    friend istream &operator>>(istream &in, MatrixOfComplexNo &MatA)
    {
        cout << "Enter the Number of Rows for the complex matrix = ";
        in >> MatA.noOfRows;
        MatA.noOfColsForEachRow = new int[MatA.noOfRows];
        for (int i = 0; i < MatA.noOfRows; i++)
        {
            cout << "Enter the Number of Column for Row " << i + 1 << " of the matrix = ";
            in >> MatA.noOfColsForEachRow[i];
        }
        cout << "Populate the Matrix = " << endl;
        for (int i = 0; i < MatA.noOfRows; i++)
        {
            MatA.complexRowPtr[i] = new ComplexNo[MatA.noOfColsForEachRow[i]];
            for (int j = 0; j < MatA.noOfColsForEachRow[i]; j++)
            {
                cout << "Enter for ComplexMat[" << i << "]"
                     << "[" << j << "] = " << endl;
                in >> MatA.complexRowPtr[i][j];
            }
        }
    }
    friend ostream &operator<<(ostream &out, MatrixOfComplexNo &a)
    {
        for (int i = 0; i < a.noOfRows; i++)
        {
            for (int j = 0; j < a.noOfColsForEachRow[i]; j++)
            {
                out << a.complexRowPtr[i][j] << ' ';
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
    MatrixOfComplexNo(int x)
    {
        noOfRows = x;
        noOfColsForEachRow = new int[noOfRows];
        for (int i = 0; i < noOfRows; i++)
        {
            cin >> noOfColsForEachRow[i];
        }
    }
    MatrixOfComplexNo operator[](int x)
    {
       return noOfColsForEachRow[x];
    }
};
void showComplexMatrices(MatrixOfComplexNo *x, int numofMat)
{
    for (int i = 0; i < numofMat; i++)
    {
        cout << "Matrix " << i + 1 << " is equivalent to = " << endl
             << x[i] << endl;
    }
}
ComplexNo *
int main()
{
    int n, row, i;
    MatrixOfComplexNo *matrixPtr;
    cout << "How many matrices of complex nos? ";
    cin >> n;
    matrixPtr = new MatrixOfComplexNo[n];
    for (i = 0; i < n; i++)
    {
        cout << "Enter for Matrix " << i + 1 << " = " << endl;
        cin >> matrixPtr[i];
    }
    cout << "The matrices of complex numbers  is/are = " << endl;
    showComplexMatrices(matrixPtr, n);
    ComplexNo *mergedRow;
    cout << "Enter indices of two rows of the first matrix to merge = ";
    int rowindex1, rowindex2;
    cin >> rowindex1 >> rowindex2;
    mergedRow = matrixPtr[0][rowindex1];//mergeWith(rowindex2);
}