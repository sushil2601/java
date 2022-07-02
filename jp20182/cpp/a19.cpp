#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();
const int n=10;

//size of array must be constant
int x[n],i,t;

cout<<"Input array: ";
for(i=0;i<n;i++)
cin>>x[i];

for(i=0;i<n/2;i++)
{
	t=x[i];
	x[i]=x[n-1-i];
	x[n-1-i]=t; 
}

cout<<"Reverse of array:\n ";
for(i=0;i<n;i++)
cout<<x[i]<<"\t";


getch();

}