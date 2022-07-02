class student
{
int roll;
String name;

student(int roll,String name)
{
this.roll=roll;
this.name=name;
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

student s1=new student(10,"aman");
System.out.println(s1);

}
}