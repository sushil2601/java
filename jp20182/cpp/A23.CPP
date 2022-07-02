
#include<iostream.h>
#include<conio.h>

void abc(int,int&,int&,int&);

void main()
{
clrscr();
int n;
cin>>n;

int a,b,c;

abc(n,a,b,c);

cout<<"square is "<<a<<endl;
cout<<"cube is "<<b<<endl;
cout<<"factorial is "<<c<<endl;

getch();
}

void abc(int x,int &y,int &z,int &k)
{
	y=x*x;
	z=x*x*x;
	
	k=1;
	for(int i=1;i<=x;i++)
	 k*=i;
}