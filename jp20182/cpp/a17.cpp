#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();
const int n=5;

//size of array must be constant
int x[n],i;

cout<<"Input array: ";
for(i=0;i<n;i++)
cin>>x[i];

cout<<"Array is:\n ";
for(i=0;i<n;i++)
cout<<x[i]<<"\t";


getch();

}