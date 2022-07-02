class abc
{

void show()
{
System.out.println("Hello");
}

}

class xyz extends abc
{

void display()
{
System.out.println("World");
}

void f()
{
System.out.println("Bye");
show();
}

}

