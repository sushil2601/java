#include<stdio.h>
#include<conio.h>

void main()
{
int a,b;
clrscr();
a=50;

a>>=2;
b=a++;
b+=a;
b<<=3;
b&=7;

printf("%d,%d",b,a);

getch();
}

	
