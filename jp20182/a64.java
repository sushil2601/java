class complex
{
int real,img;

complex()
{
real=0;
img=0;
}

complex(int a,int b)
{
real=a;
img=b;
}

void show()
{
if(img>=0)
System.out.println(real+"+i"+img);
else
System.out.println(real+"-i"+ -img);
}

complex add(complex a)
{
complex t=new complex();
t.real=real+a.real;
t.img=img+a.img;
return t;
}


complex multiply(complex a)
{
complex t=new complex();

t.real=real*a.real-img*a.img;
t.img=real*a.img+img*a.real;

return t;
}



}