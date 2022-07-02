class abc
{
public static void main(String s[])
{

long a=10;	
int b;

b=a; //error because larger data type cannot be assigned to 	smaller data type automatically

b=(int)a; //allowed
System.out.println(b);

a=b; //allowed

}
}

/*

Java does not assign larger data type to smaller data type automatically.

We can do so with explicit conversion (type casting)

*/