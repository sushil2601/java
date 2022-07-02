class person
{
int age;
String name;

person(String name,int age)
{
this.name=name;
this.age=age;
}

void show()
{
System.out.println("Name: "+name);
System.out.println("Age: "+age);
}

}

class student extends person
{
int roll,fee;
float marks;

static int pass,fail;

student(int roll,String name,int age,int fee,float marks)
{
super(name,age);
this.roll=roll;
this.fee=fee;
this.marks=marks;
if(this.marks<40)
fail++;
else
pass++;
}


void show()
{
super.show();
System.out.println("Roll: "+roll);
System.out.println("Fee: "+fee);
System.out.println("Marks: "+marks);

if(marks<40)
System.out.println("Fail");
else
System.out.println("Pass");
}

static void showOverallResult()
{
System.out.println("Total Pass: "+pass);
System.out.println("Total Fail: "+fail);
}

}