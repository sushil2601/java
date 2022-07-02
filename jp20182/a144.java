class student
{
String name;
int roll;
static int count;

static
{
System.out.println("Welcome to program");
}

student(int roll,String name)
{
this.roll=roll;
this.name=name;
count++;
}

static void display()
{
System.out.println("Count: "+count);
}

public String toString()
{
	return roll+","+name;
}
}

class abc
{

public static void main(String s[])
{

student a=new student(100,"aman");
System.out.println(a);

student a1=new student(101,"raman");
System.out.println(a1);

student a2=new student(102,"amandeep");
System.out.println(a2);

student.display();

}

}
