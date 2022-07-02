//Method overriding
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
show();
super.show();
}

void show()
{
System.out.println("Best");
}

}

