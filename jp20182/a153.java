import java.util.Date;

class abc
{
public static void main(String s[])
{
Date d=new Date();
long k=d.getTime(); //returns msecs passed since Jan 1,1970 
System.out.println(k);

}
}