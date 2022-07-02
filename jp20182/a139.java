import java.util.Scanner;

class abc
{
public static void main(String s[])
{
Scanner p=new Scanner(System.in);

System.out.println("Input number: ");
float k=p.nextFloat();

String x=String.valueOf(k);

if(x.startsWith("9") && x.endsWith("3"))
{
x=x.replace(".","");
}

System.out.println(x);

if(x.length()>5)
x=x.substring(0,5);

System.out.println(x);

}
}
