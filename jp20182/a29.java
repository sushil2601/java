import java.util.Scanner;

class abc
{
public static void main(String s[])
{
Scanner p=new Scanner(System.in);

int n;
System.out.println("Enter size of array: ");
n=p.nextInt();

int x[]=new int[n];

System.out.println("Enter array: ");
for(int i=0;i<x.length;i++)
 x[i]=p.nextInt();

int min=x[0];

for(int i=1;i<x.length;i++)
{
   if(x[i]<min)
     min=x[i];
}

System.out.println("Smallest element is "+min);

}
}

