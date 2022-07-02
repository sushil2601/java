import java.io.*;

public class abc12 {
public static void main(String s[]) 
{    
File f=new File("d:/exr"); 
File x[]=f.listFiles();
for(File k:x)
{
    String p=k.isDirectory()?"Folder":"File";
    System.out.println(k+"-"+p);
}


File z[]=File.listRoots();
for(File k:z)
{
    System.out.println(k);
}
}
}
