import java.util.Scanner;

class student
{
private int roll;
private String name;
private float marks;

void input()
{
 Scanner k=new Scanner(System.in);
 Scanner k1=new Scanner(System.in);
 
 System.out.println("Input roll: ");
 roll=k.nextInt();

 System.out.println("Input name: ");
 name=k1.nextLine();

 System.out.println("Input marks: ");
 marks=k.nextFloat();
}

void show()
{
System.out.println(roll+","+name+","+marks);
}

void set(int x)
{
roll=x;
}

void set(String m)
{
name=m;
}

void set(float t)
{
marks=t;
}

void set(int a,String b,float c)
{
roll=a;
name=b;
marks=c;
}


}