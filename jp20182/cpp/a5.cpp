#include<iostream.h>
#include<conio.h>

void main()
{
clrscr();

int n,i,flag;

for(n=1;n<=100;n++)
{

flag=1;

for(i=2;i<=n/2;i++)
{
  if(n%i==0)
  {
	flag=0;
	break;
  }

}


if(flag==1 && n>1)
cout<<n<<"\t";

}
getch();

}