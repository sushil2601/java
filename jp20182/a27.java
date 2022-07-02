import java.util.Scanner;

class abc
{
public static void main(String s[])
{
Scanner p=new Scanner(System.in);

int n;
System.out.println("Enter size of array: ");
n=p.nextInt();

int x[]=new int[];

System.out.println(x.length); 

System.out.println("Enter array: ");

for(int i=0;i<x.length;i++)
 x[i]=p.nextInt();

System.out.println("Array is:");

for(int i=0;i<x.length;i++)
 System.out.print(x[i]+"\t");

}
}

