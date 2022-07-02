
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class abc5 {
  public static void main(String s[]) throws ParseException
    {
        Date d=new Date();
        System.out.println(d);
        
        Date d1=new Date(0);
        System.out.println(d1);
        
        d1=new Date(24*60*60*1000);
        System.out.println(d1);
        
        d1=new Date(-24*60*60*1000);
        System.out.println(d1);
        
        boolean b=d1.before(d);
        System.out.println(b);//true
        
        b=d1.after(d);
        System.out.println(b);//false
        
        SimpleDateFormat f=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss SSS a E Z");
        String k=f.format(d);
        System.out.println(k);
        
        f=new SimpleDateFormat("'He came on 'dd-MMM-yyyy' at 'HH:mm:ss'. Day was 'E");
        k=f.format(d);
        System.out.println(k);
        
        String s1="10/05/2018";
        f=new SimpleDateFormat("dd/MM/yyyy");
        Date d2=f.parse(s1);
        System.out.println(d2);
        
        long p=d2.getTime();
        System.out.println(p);
        
    }    
}
