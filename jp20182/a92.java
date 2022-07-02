abstract class abc
{
void show()
{
System.out.println("A");
}

abstract void f();
abstract void k();
}

class xyz extends abc
{

void display()
{
System.out.println("B");
}

void k()
{
System.out.println("C");
}

void f()
{
System.out.println("D");
}
}
