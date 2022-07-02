#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();

long n,m;
int s=0,k;

cin>>n;
m=n;

while(n>0)
{
k=n%10;
s=s+k*k*k;
n=n/10;
}

if(s==m)
cout<<"Armstrong";
else
cout<<"Not Armstrong";

getch();

}