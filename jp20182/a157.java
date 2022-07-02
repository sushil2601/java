import java.util.Calendar;
import java.util.Date;

class abc
{
public static void main(String s[]) 
{

Calendar c=Calendar.getInstance();
Date d=c.getTime();
System.out.println(d);

c.set(Calendar.MONTH,7);
d=c.getTime();
System.out.println(d);

c.set(Calendar.DATE,1);
c.add(Calendar.MONTH,1);
c.add(Calendar.DATE,-1);

int n=c.get(Calendar.DATE);

System.out.println(n);

}
}