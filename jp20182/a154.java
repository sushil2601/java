import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class abc
{
public static void main(String s[]) throws ParseException
{
String s1="24/06/2018";
SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");

Date d1=f.parse(s1); //converts string to date
System.out.println(d1);

Date d2=new Date();
System.out.println(d2);


if(d1.before(d2))
System.out.println("d1 comes before d2");
else
System.out.println("d1 does not come before d2");



}
}