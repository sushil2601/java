#include<iostream.h>
#include<conio.h>

int square(int);

void main()
{
clrscr();

int k=20+square(10);

cout<<k;

getch();
}

int square(int n)
{
return n*n;
}