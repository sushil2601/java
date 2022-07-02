import java.util.Date;
import java.text.SimpleDateFormat;

class abc
{

public static void main(String s[])
{

Date d=new Date(); 
System.out.println(d);

SimpleDateFormat k=new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a HH:mm:ss E z");

String a=k.format(d);
System.out.println(a);

}

}
