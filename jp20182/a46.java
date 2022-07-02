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

void change(int a,int b)
{
ft=a;
inch=b;
}


}