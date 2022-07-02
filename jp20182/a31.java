import java.util.Scanner;

class abc
{
public static void main(String s[])
{
Scanner p=new Scanner(System.in);

int x[][]=new int[3][5];

System.out.println("Enter 2d array : ");
for(int i=0;i<x.length;i++)
{
  for(int j=0;j<x[i].length;j++)
	x[i][j]=p.nextInt();

}

int sum;
for(int i=0;i<x.length;i++)
{
   sum=0;	
   for(int j=0;j<x[i].length;j++)
   {
	sum+=x[i][j];
   }

System.out.println("Sum of row "+i+" is "+sum);
}  


}
}

