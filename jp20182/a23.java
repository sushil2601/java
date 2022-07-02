import java.util.Scanner;

class abc
{
public static void main(String x[])
{
Scanner p=new Scanner(System.in);

int n;
boolean prime=true;

System.out.println("Enter n: ");
n=p.nextInt();

for(int i=2;i<=n/2;i++)
{

 if(n%i==0)
 {
	prime=false;
	break;
 }

}


if(prime==true && n>1)
 System.out.println("Prime");
else
 System.out.println("Not Prime");



}
}

