import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class abc
{
public static void main(String s[]) throws ParseException
{
String s1="24/08/2018";
SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");

Date d1=f.parse(s1); //converts string to date
System.out.println(d1);

Date d2=new Date();
System.out.println(d2);

long k=d1.getTime()-d2.getTime();

long days=k/(24*60*60*1000);

System.out.println(days);


}
}