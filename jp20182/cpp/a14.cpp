#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();

int x[10],i;

cout<<"Input array: ";
for(i=0;i<10;i++)
cin>>x[i];

cout<<"Array is:\n ";
for(i=0;i<10;i++)
cout<<x[i]<<"\t";


getch();

}