import java.io.*;
import java.util.Date;

public class abc10 {
public static void main(String s[]) 
{    
File f=new File("d:/exr/lohit.java");    
System.out.println(f);

boolean b=f.exists();
System.out.println(b);

String k=f.getPath();
System.out.println(k);

k=f.getAbsolutePath();
System.out.println(k);

k=f.getName();
System.out.println(k);

k=f.getParent();
System.out.println(k);

b=f.isAbsolute();
System.out.println(b);

b=f.isFile();
System.out.println(b);

b=f.isDirectory();
System.out.println(b);

b=f.isHidden();
System.out.println(b);

long g=f.length();
System.out.println(g);

g=f.lastModified();
System.out.println(g);
Date d=new Date(g);
System.out.println(d);

/*File f1=new File("d:/ex1/xyz.class");
b=f.renameTo(f1);
System.out.println(b);
*/

b=f.delete();
System.out.println(b);

b=f.setReadOnly();
System.out.println(b);


}
}
