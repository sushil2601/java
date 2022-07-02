import java.util.Date;
import java.text.SimpleDateFormat;

class abc
{

public static void main(String s[])
{

Date d=new Date(); 
System.out.println(d);

SimpleDateFormat k=new SimpleDateFormat("'Today is 'dd-MMM-yyy' and time now is 'HH:mm:ss' and day is 'E");

String a=k.format(d);
System.out.println(a);

}

}
