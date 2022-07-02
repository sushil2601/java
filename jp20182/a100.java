interface abc
{
int a=10;
void f();
void k(int z);
}

interface abc1
{
void z();
}

class xyz implements abc,abc1
{

void show()
{
System.out.println("A");
System.out.println(a);
//a=70;//error
}

public void k(int y)
{
System.out.println("B");
}

public void f()
{
System.out.println("C");
}

public void z()
{
System.out.println("D");
}

}