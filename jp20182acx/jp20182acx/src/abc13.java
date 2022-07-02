import java.io.*;

public class abc13 {
public static void main(String s[]) throws IOException 
{    
File f=new File("d:/exr/abc");
boolean b=f.mkdir();
System.out.println(b);

File f1=new File("d:/exr/abc/xyz/uvw");
b=f1.mkdirs();
System.out.println(b);

File f2=new File("d:/exr/abc/xyz/uvw/a1.txt");
b=f2.createNewFile();
System.out.println(b);

}
}
