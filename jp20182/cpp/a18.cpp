#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();

//size of array must be constant
int x[10],i,t;

cout<<"Input array: ";
for(i=0;i<10;i++)
cin>>x[i];

for(i=0;i<10/2;i++)
{
	t=x[i];
	x[i]=x[9-i];
	x[9-i]=t; 
}

cout<<"Reverse of array:\n ";
for(i=0;i<10;i++)
cout<<x[i]<<"\t";


getch();

}