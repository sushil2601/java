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
}

void show()
{
System.out.println("Best");
super.show();
}

}

