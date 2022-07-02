/*
If sub class has a function with same name, same argument & same return type of a function in its super class then it is known as function overriding.

In case of function overriding, sub class object will prefer calling its own function rather than overidden super class function.
*/

#include<iostream.h>
#include<conio.h>

class abc
{
public:
void show()
{
cout<<"hello"<<endl;
}

};

class xyz : public abc
{

public:
void display()
{
cout<<"world"<<endl;
}

void show()
{
cout<<"bye"<<endl;
}

};


void main()
{
clrscr();

abc t;
t.show(); //hello

xyz k;
k.show(); //bye
k.display(); //world
k.abc::show(); //hello


getch();
}