#include<iostream.h>
#include<conio.h>
#include<process.h>

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
	getch();
	exit(0);
  }
 
}



cout<<"Prime";

getch();

}