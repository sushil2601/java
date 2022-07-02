import java.util.Scanner;

class abc
{
public static void main(String s[])
{
Scanner p=new Scanner(System.in);

int x[]=new int[8];

System.out.println(x.length); //5

System.out.println("Enter array: ");

for(int i=0;i<x.length;i++)
 x[i]=p.nextInt();

System.out.println("Array is:");

for(int i=0;i<x.length;i++)
 System.out.print(x[i]+"\t");

}
}

