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

};


void main()
{
clrscr();

abc t;
t.show(); //hello

xyz k;
k.show(); //hello
k.display(); //world


getch();
}