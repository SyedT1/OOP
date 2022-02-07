#include <iostream>
using namespace std;
class Book
{
    string bookName;
    string *authorNames;
    int noOfAuthors;
    float price;
    friend istream &operator>>(istream &in, Book &a)
    {
        cout << "Enter the Book's name = ";
        in.ignore();
        getline(in, a.bookName);
        cout << "Enter the # of Authors = ";
        in >> a.noOfAuthors;
        a.authorNames = new string[a.noOfAuthors];
        for (int i = 0; i < a.noOfAuthors; i++)
        {
            cout << "Enter the name of Author #" << i + 1 << ":";
            if (i == 0)
                in.ignore();
            getline(in, a.authorNames[i]);
        }
        cout << "Enter the price of the Book = ";
        in >> a.price;
    }
    friend ostream &operator<<(ostream &out, Book a)
    {
        out << "The Book's Name:" << a.bookName << endl;
        out << "Total No. of Authors = " << a.noOfAuthors << endl;
        for (int i = 0; i < a.noOfAuthors; i++)
        {
            out << "Author #" << i + 1 << ":" << a.authorNames[i] << endl;
        }
        return out;
    }

public:
};
class Course
{
    string courseID, courseTitle;
    int noOfCredits;
    Book textBook;
    friend int operator+=(int &total, Course a)
    {
        total += a.getcredits();
        return total;
    }

public:
    Course &setCourseInfo()
    {
        cout << "Enter courseID: ";
        cin >> courseID;
        cout << "Enter courseTitle: ";
        cin.ignore();
        getline(cin, courseTitle);
        cout << "Enter NoOfCredits: ";
        cin >> noOfCredits;
        cout << "Enter TextBook Info: " << endl;
        cin >> textBook;
        return *this;
    }
    void showCourseInfo()
    {
        cout << "Course INFO:" << endl;
        cout << "Course ID:" << courseID << endl;
        cout << "Course Title:" << courseTitle << endl;
        cout << "Total No Of Credits:" << noOfCredits << endl;
        cout << textBook << endl;
    }
    int getcredits()
    {
        return noOfCredits;
    }
};
int getBillAmount(Course *enrolledones, int numC, int R, int ScP)
{
    int totalC = 0;
    for (int i = 0; i < numC; i++)
    {
        totalC += enrolledones[i];
    }
    totalC *= R;
    double disc = double(totalC) * (ScP / double(100));
    return totalC - disc;
}
int main()
{
    Course *enrolledCourses;
    int n, i, ratePerCredit, scholarshipPercent;
    cout << "How many courses to enroll?" << endl;
    cin >> n;
    cout << "Rate per credit for this student = ";
    cin >> ratePerCredit;
    cout << "Scholarship(%) for this student = ";
    cin >> scholarshipPercent;
    enrolledCourses = new Course[n];
    for (i = 0; i < n; i++)
    {
        enrolledCourses[i].setCourseInfo().showCourseInfo();
    }
    cout << "Total amount to be paid is :" << getBillAmount(enrolledCourses, n, ratePerCredit, scholarshipPercent) << endl;
    return 0;
}