#include<iostream.h>
#include<conio.h>

void stars(int,char);

void main()
{
clrscr();

stars(5,'#');
cout<<"Hello"<<endl;
stars(8,'$');
cout<<"World"<<endl;
stars(10,'*');
cout<<"Test"<<endl;
stars(3,'&');

getch();
}

void stars(int n,char x)
{
for(int i=1;i<=n;i++)
cout<<x;

cout<<endl;
}