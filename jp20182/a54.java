import java.util.Scanner;

class distance
{
int ft,inch;
distance()
{
ft=0;
inch=0;
}

distance(int a,int b)
{
ft=a;
inch=b;
}

void show()
{
System.out.println(ft+"'"+inch+"\"");
}

distance add(distance a)
{
distance t=new distance();
t.ft=ft+a.ft;
t.inch=inch+a.inch;
return t;
}

}