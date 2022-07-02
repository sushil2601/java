
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class abc7 {
public static void main(String s[]) 
{
    Calendar x=Calendar.getInstance();
    x.set(Calendar.MONTH, 11);
    Date d=x.getTime();
    System.out.println(d);
    
    x.add(Calendar.MONTH, 1);
    x.set(Calendar.DATE,1);
    x.add(Calendar.DATE,-1);
    
    int n=x.get(Calendar.DATE);
    System.out.println(n);
    
    n=x.getActualMaximum(Calendar.DATE);
    System.out.println(n);
    
    
}
}
