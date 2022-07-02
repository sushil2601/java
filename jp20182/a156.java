import java.util.Calendar;
import java.util.Date;

class abc
{
public static void main(String s[]) 
{

Calendar c=Calendar.getInstance();
Date d=c.getTime();
System.out.println(d);

int n=c.get(Calendar.DATE);
System.out.println(n); //12

n=c.get(Calendar.MONTH);
System.out.println(n); //5

n=c.get(Calendar.YEAR);
System.out.println(n); //2018

n=c.get(Calendar.HOUR);
System.out.println(n); //10

n=c.get(Calendar.MINUTE);
System.out.println(n); //55

n=c.get(Calendar.SECOND);
System.out.println(n); //18

n=c.get(Calendar.WEEK_OF_YEAR);
System.out.println(n); //

n=c.get(Calendar.DAY_OF_WEEK);
System.out.println(n); //

c.set(Calendar.HOUR,3);
c.set(Calendar.YEAR,2016);

d=c.getTime();
System.out.println(d);


c.add(Calendar.MONTH,3);
d=c.getTime();
System.out.println(d);




}
}