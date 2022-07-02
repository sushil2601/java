import java.util.Date;

class abc
{

public static void main(String s[])
{

Date d=new Date(); //object with current date/time
System.out.println(d);

Date d1=new Date(0); 
System.out.println(d1);//Jan 1, 1970 

Date d2=new Date(24*60*60*1000); 
System.out.println(d2);//Jan 2, 1970 

Date d3=new Date(-24*60*60*1000); 
System.out.println(d3);//Dec 31,1969 

Date d4=new Date(System.currentTimeMillis()+60*60*1000); 
System.out.println(d4);//Jun 11, 2018 12:59

boolean b=d1.after(d2);
System.out.println(b);//false

b=d1.before(d2);
System.out.println(b);//true

b=d1.equals(d2);
System.out.println(b);//false
}

}
