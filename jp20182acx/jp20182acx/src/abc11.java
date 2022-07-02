import java.io.*;

public class abc11 {
public static void main(String s[]) 
{    
File f=new File("d:/exr"); 
String x[]=f.list();
for(String k:x)
{
    System.out.println(k);
}

}
}
