class complex
{
int real,img;

static int count;

complex()
{
real=0;
img=0;
count++;
}

complex(int a,int b)
{
real=a;
img=b;
count++;
}

void show()
{
if(img>=0)
System.out.println(real+"+i"+img);
else
System.out.println(real+"-i"+ -img);
}

void test()
{
complex k=new complex();
}

static void showCount()
{
System.out.println("Number of objects : "+count);
}


}