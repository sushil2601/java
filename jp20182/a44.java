import java.util.Scanner;

class distance
{
int ft,inch;

distance(int a,int b)
{
ft=a;
inch=b;
}

void input()
{
Scanner k=new Scanner(System.in);
System.out.print("Input ft: ");
ft=k.nextInt();
System.out.print("Input inch: ");
inch=k.nextInt();
}

void show()
{
System.out.println(ft+"'"+inch+"\"");
}

void change(int a)
{
ft=a;
}

void change(int a,int b)
{
ft=a;
inch=b;
}


}