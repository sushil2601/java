abstract class xyz
{
abstract void f();
abstract void k();

}

class abc extends xyz
{
void show()
{
System.out.println("A");
}

void f()
{
System.out.println("B");
}

void k()
{
System.out.println("C");
}

}