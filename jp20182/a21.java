import java.util.Scanner;

class abc
{
public static void main(String x[])
{
Scanner p=new Scanner(System.in);

int k,f,n,s=0;

System.out.println("Enter n: ");
n=p.nextInt();

for(k=1;k<=n;k++)
{

f=1;
for(int i=1;i<=k;i++)
  f*=i;

s+=f;
}

System.out.println(s);

}
}

