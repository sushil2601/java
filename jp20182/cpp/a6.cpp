#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();

long n;
int sum=0,k;

cin>>n;

while(n>0)
{
k=n%10;
sum=sum+k;
n=n/10;
}

cout<<"Sum is "<<sum;



getch();

}