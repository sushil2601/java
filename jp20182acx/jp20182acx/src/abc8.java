
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class abc8 {
public static void main(String s[]) throws ParseException
{
    //GregorianCalendar x=new GregorianCalendar();
    //GregorianCalendar x=new GregorianCalendar(2018,5,19);
    //GregorianCalendar x=new GregorianCalendar(2018,5,19,20,45);
    GregorianCalendar x=new GregorianCalendar(2018,5,19,20,45,39);
    
    boolean b=x.isLeapYear(2016);
    System.out.println(b);
    
    b=x.isLeapYear(2018);
    System.out.println(b);
    
    Date d=x.getTime();
    System.out.println(d);
    
    int n;
    n=x.get(Calendar.DATE);
    System.out.println(n); //25
    
    n=x.get(Calendar.MONTH);
    System.out.println(n); //6
    
    n=x.get(Calendar.YEAR);
    System.out.println(n); //2018
    
    n=x.get(Calendar.HOUR);
    System.out.println(n); //9
    
    n=x.get(Calendar.MINUTE);
    System.out.println(n); //57
    
    n=x.get(Calendar.SECOND);
    System.out.println(n); //39
    
    n=x.get(Calendar.DAY_OF_WEEK);
    System.out.println(n); //4
    
    n=x.get(Calendar.DAY_OF_YEAR);
    System.out.println(n); //206
    
    n=x.get(Calendar.WEEK_OF_YEAR);
    System.out.println(n); //30
    
    
    x.set(Calendar.DATE, 12);
    x.set(Calendar.MONTH, 9);
    x.set(Calendar.YEAR, 2016);
    x.set(Calendar.HOUR, 22);
    x.set(Calendar.MINUTE, 32);
    x.set(Calendar.SECOND, 52);
    
    d=x.getTime();
    System.out.println(d);
    
    Date d1=new Date(0);
    x.setTime(d1);
    d=x.getTime();
    System.out.println(d);
    
    String g="23/05/2019 21:17:34";
    SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date d2=f.parse(g);
    x.setTime(d2);
    d=x.getTime();
    System.out.println(d);
    
    n=x.get(Calendar.DAY_OF_YEAR);
    System.out.println(n);
    
    
x.add(Calendar.MONTH,5);	
    d=x.getTime();
    System.out.println(d);
        
    
    
    
    
    
    
    
    
    
    
    
}
}
