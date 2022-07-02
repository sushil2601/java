import java.util.Scanner;

class distance
{
int ft,inch;
distance()
{
ft=3;
inch=8;
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

void test(distance k)
{
k.ft=9;
k.inch=1;
}

void xyz(distance k)
{
k.ft=10;
k.inch=7;
ft=6;
inch=8;
}




}