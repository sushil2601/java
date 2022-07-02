#include<iostream.h>
#include<conio.h>

class student
{
int roll,marks;
char name[50];

public:

student()
{
roll=0;
strcpy(name,"no name");
marks=100;
}

student(int a,char b[])
{
roll=a;
strcpy(name,b);
marks=100;
}

student(int a,char b[],int c)
{
roll=a;
strcpy(name,b);
marks=c;
}

~student()
{
cout<<"Destructor called";
}

void input()
{
cout<<"Input roll: ";
cin>>roll;
cout<<"Input name: ";
gets(name);
cout<<"Input marks: ";
cin>>marks;
}

void show()
{
cout<<roll<<","<<name<<","<<marks<<endl;
}

void set(char a[])
{
strcpy(name,a);
}

void set(int p)
{
marks=p;
}

void set(char a[],int z)
{
strcpy(name,a);
marks=z;
}

void set(int d,char a[],int z)
{
roll=d;
strcpy(name,a);
marks=z;
}

};


void main()
{
clrscr();

student s1;
cout<<sizeof(s1)<<endl;

s1.input();
s1.show();

s1.set("xyz");
s1.show();

s1.set(30);
s1.show();

s1.set("kkk",60);
s1.show();

s1.set(89,"aaaa",80);
s1.show();


student s2,s3(345,"aman"),s4(678,"raman",98);
s2.show();
s3.show();
s4.show();

student h[5];
for(int i=0;i<5;i++)
h[i].input();

for(i=0;i<5;i++)
h[i].show();


getch();
}