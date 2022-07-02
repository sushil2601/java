#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();

long n;
int c=0;

cin>>n;

while(n>0)
{
c++;
n=n/10;
}

cout<<"Count is "<<c;



getch();

}