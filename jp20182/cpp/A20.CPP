#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();

int n=10;
int& m=n;    //reference variable

cout<<n<<"\t"<<m<<endl; //10 10

m=40;
cout<<n<<"\t"<<m<<endl; //40 40

n=20;
cout<<n<<"\t"<<m<<endl; //20 20

getch();

}