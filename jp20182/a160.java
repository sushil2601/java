import java.util.Calendar;
import java.util.Date;
import java.text.*;

class abc
{
public static void main(String s[]) throws ParseException
{
String s1="19/03/2019";
SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
Date d=f.parse(s1);

Calendar c=Calendar.getInstance();
c.setTime(d);

int n=c.get(Calendar.WEEK_OF_YEAR);
System.out.println(n);

}
}