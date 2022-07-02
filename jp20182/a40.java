class abc
{

public static void main(String s[])
{

int a=19;
int c;

c=a>>>1;
System.out.println(c); //9

a=-25;
c=a>>>1;
System.out.println(c); //2147483635

c=~a;
System.out.println(c); //24

a=27;
c=~a;
System.out.println(c); //-28


}

}