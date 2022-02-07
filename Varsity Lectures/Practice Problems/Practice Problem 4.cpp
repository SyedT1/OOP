#include <iostream>
using namespace std;
class Author
{
    string authorName, authorEmail;
    friend istream &operator>>(istream &in, Author &a)
    {
        cout << "Enter Name:";
        cin.ignore();
        getline(in, a.authorName);
        cout << "Enter Email:";
        in >> a.authorEmail;
        return in;
    }
    friend ostream &operator<<(ostream &out, Author &a)
    {
        out << "Author's Name = " << a.authorName << endl;
        out << "Author's Email = " << a.authorEmail << endl;
        return out;
    }

public:
    string getName()
    {
        return authorName;
    }
    string getEmail()
    {
        return authorEmail;
    }
};
class Book
{
    string bookName, isbn;
    Author *authorList;
    int noOfAuthors;
    float price;
    friend ostream &operator<<(ostream &out, Book a)
    {
        out << "Book Title is = " << a.bookName << endl;
        out << "Book ISBN is = " << a.isbn << endl;
        out << "Book Price is = " << a.price << endl;
        out << "Authors are :" << endl;
        for (int i = 0; i < a.noOfAuthors; i++)
        {
            out << "Author " << i + 1 << " #:" << endl;
            out << a.authorList[i] << endl;
        }
        return out;
    }
    friend istream &operator>>(istream &in, Book &a)
    {
        cout << "Enter BookName:";
        cin.ignore();
        getline(in, a.bookName);
        cout << "Enter ISBN:";
        in >> a.isbn;
        cout << "Enter # of Authors:";
        in >> a.noOfAuthors;
        a.authorList = new Author[a.noOfAuthors];
        for (int i = 0; i < a.noOfAuthors; i++)
        {
            cout << "Enter Info for Author " << i + 1
                 << ":" << endl;
            cin >> a.authorList[i];
        }
        cout << "Enter the price = ";
        in >> a.price;
        return in;
    }

public:
    Book &setBookName()
    {
        getline(cin, bookName);
        return *this;
    }
    Book &setisbn()
    {
        cin >> isbn;
        return *this;
    }
    Book &setAuthors()
    {
        cout << "Enter the number of authors = ";
        cin >> noOfAuthors;
        authorList = new Author[noOfAuthors];
        for (int i = 0; i < noOfAuthors; i++)
        {
            cout << "For Author " << i + 1 << ":" << endl;
            cin >> authorList[i];
        }
        return *this;
    }
    void setprice()
    {
        cin >> price;
    }
};
class Course
{
    string courseID, courseTitle;
    int noOfCredits;
    Book textBook;
    friend int operator+=(int &x, Course &a)
    {
        x =  x + a.noOfCredits;
        return x;
    }

public:
    Course &populateCourse()
    {
        cout << "Enter courseID:";
        cin >> courseID;
        cout << "Enter courseTitle:";
        cin.ignore();
        getline(cin, courseTitle);
        cout << "Enter noOfCredits:";
        cin >> noOfCredits;
        cout << "Enter Book Information = " << endl;
        cin >> textBook;
        return *this;
    }
    void displayCourse()
    {
        cout << "Course Title is = " << courseTitle << " and its ID is = " << courseID << endl;
        cout << "No of Credits = " << noOfCredits << endl;
        cout << "Book Information = " << endl
             << textBook << endl;
    }
};
void allocateMemory(Course *&a, int size)
{
    a = new Course[size];
}

int main()
{
    Course *courseArr;
    int n, i;
    cout << "How many courses ? ";
    cin >> n;
    allocateMemory(courseArr, n);
    for (i = 0; i < n; i++)
    {
        courseArr[i].populateCourse().displayCourse();
    }
    int totalCredits = 0;
    for (i = 0; i < n; i++)
    {
        totalCredits += courseArr[i];
    }
    cout << "Total Number of credits of these courses = " << totalCredits << endl;
    return 0;
}