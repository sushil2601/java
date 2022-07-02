interface abc
{
int a=10;
void f();
void k(int z);
}

class xyz implements abc
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


}