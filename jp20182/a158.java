import java.util.Calendar;
import java.util.Date;

class abc
{
public static void main(String s[]) 
{
int m=Integer.parseInt(s[0]);

if(m<1 || m>12)
{
System.out.println("Invalid month");
return;
}

Calendar c=Calendar.getInstance();
c.set(Calendar.MONTH,m-1);


c.set(Calendar.DATE,1);
c.add(Calendar.MONTH,1);
c.add(Calendar.DATE,-1);

int n=c.get(Calendar.DATE);

System.out.println(n);

}
}