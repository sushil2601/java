abstract class shape
{
abstract void area();
}

class rect extends shape
{
int w,h;
rect()
{
w=h=0;
}

rect(int w,int h)
{
this.w=w;
this.h=h;
}

void show()
{
System.out.println(w+","+h);
}

void area()
{
System.out.println("Area: "+(w*h));
}

}

class circle extends shape
{
float rad;
circle()
{
rad=0;
}

circle(float rad)
{
this.rad=rad;
}

void display()
{
System.out.println(rad);
}

void area()
{
System.out.println("Area: "+(3.14*rad*rad));
}

}