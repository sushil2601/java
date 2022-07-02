import java.util.Date;
import java.text.SimpleDateFormat;

class abc
{

public static void main(String s[])
{

Date d=new Date(); 

SimpleDateFormat k=new SimpleDateFormat("E");
String z=k.format(d);

if(z.equalsIgnoreCase("Sat")||z.equalsIgnoreCase("Sun"))
System.out.println("Weekend");
else
System.out.println("Weekday");
}

}
