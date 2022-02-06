#include <iostream>
using namespace std;
class Author
{
    int ID;
    string name, email;

public:
    Author &set_ID()
    {
        cout << "Enter ID:";
        cin >> ID;
        return *this;
    }
    Author &set_Name()
    {
        cout << "Enter Name :";
        cin.ignore();
        getline(cin, name);
        return *this;
    }
    void set_email()
    {
        cout << "Enter Email:";
        cin >> email;
    }
    int getID()
    {
        return ID;
    }
    string getName()
    {
        return name;
    }

    string getEmail()
    {
        return email;
    }
};
class Book
{
    string title, ISBN;
    float price;
    int noOfAuthor;
    Author *ptr;
    friend istream &operator>>(istream &in, Book &a)
    {
        a.setTitle();
        a.setISBN();
        a.setPrice();
        cout << "Enter the # of Authors = ";
        cin >> a.noOfAuthor;
        a.ptr = new Author[a.noOfAuthor];
        for (int i = 0; i < a.noOfAuthor; i++)
        {
            a.ptr[i].set_Name().set_ID().set_email();
        }
        return in;
    }
    friend ostream &operator<<(ostream &out, Book a)
    {
        out << "Book Information:" << endl;
        out << a.getTitle() << endl
            << a.getISBN() << endl
            << a.getPrice() << endl;
        out << "Author Infos:" << endl;
        for (int i = 0; i < a.noOfAuthor; i++)
        {
            out << "Name :" << a.ptr[i].getName() << endl;
            out << "Email :" << a.ptr[i].getEmail() << endl;
            out << "ID:" << a.ptr[i].getID() << endl;
        }
        return out;
    }
    friend bool operator==(Book a, const char *c)
    {
        for (int i = 0; i < a.noOfAuthor; i++)
        {
            if (a.ptr[i].getName() == c)
            {
                return true;
            }
        }
        return false;
    }
    friend bool operator<=(Book a, int x)
    {
        return a.getPrice() <= x ? true : false;
    }

public:
    Book() {}
    Book(string t, string code, float p) : title{t}, ISBN{code}, price{p}
    {
        cout << "Enter the # of Authors:";
        cin >> noOfAuthor;
        ptr = new Author[noOfAuthor];
        for (int i = 0; i < noOfAuthor; i++)
        {
            ptr[i].set_Name().set_ID().set_email();
        }
    }
    void setTitle()
    {
        cout << "Enter title = ";
        cin.ignore();
        getline(cin, title);
    }
    void setISBN()
    {
        cout << "Enter ISBN = ";
        cin >> ISBN;
    }
    void setPrice()
    {
        cout << "Enter Price = ";
        cin >> price;
    }
    string getTitle()
    {
        return title;
    }
    string getISBN()
    {
        return ISBN;
    }
    float getPrice()
    {
        return price;
    }
};
int main()
{
    Book b1, b2("Data_Structures", "978-0-22222-33", 550);
    cout << "Give input for book 1:" << endl;
    cin >> b1;
    cout << "Complete information of the books are = " << endl;
    cout << b1 << ' ' << b2 << endl;
    cout << "For the book titled " << b1.getTitle() << endl;
    if (b1 <= 1000 || b1 == "Ataul Karim")
    {
        cout << "Ataul Karim is an Author or the price of the book is less than or equal to 1000" << endl;
    }
    else
    {
        cout << "Neither of them is true" << endl;
    }
}