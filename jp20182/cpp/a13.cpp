#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();

int a=1,b=0,c=0,n,m;

cout<<"Input a number : ";
cin>>m;

for(n=1;;n++)
{
c=a+b;
a=b;
b=c;

if(c==m)
{
cout<<"belongs";
break;
}
else if(c>m)
{
cout<<"Does not belong";
break;
}

}

getch();

}