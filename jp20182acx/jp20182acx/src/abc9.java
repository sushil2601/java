/*
File(String path)
File(String parent,String child)
File(File parent,String child)
*/
import java.io.*;

public class abc9 {
public static void main(String s[]) 
{    
File f=new File("d:/xyz/abc.txt"); 
File f1=new File("d:/xyz","abc.txt"); 
File f2=new File("d:/xyz");
File f3=new File(f2,"abc.txt"); 
    
System.out.println(f);
System.out.println(f1);
System.out.println(f3);

        
}
}
