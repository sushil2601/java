#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();

int a=1,b=0,c,n;

for(n=1;n<=10;n++)
{
cout<<c<<"\t";
c=a+b;
a=b;
b=c;
}

getch();

}