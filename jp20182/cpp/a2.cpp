#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();

int n,i;

cout<<"Enter a number: ";
cin>>n;

for(i=2;i<=n/2;i++)
{
  if(n%i==0)
  {
	cout<<"Not Prime";
	break;
  }
 

}


if(i>n/2)
cout<<"Prime";

getch();

}