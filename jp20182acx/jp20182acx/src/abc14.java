
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class abc14 {
public static void main(String s[]) throws FileNotFoundException, IOException
{
    //Open file in create/append mode
    FileOutputStream f=new FileOutputStream("abc1.txt",true);
    
    //Open file in create/overwrite mode
    //FileOutputStream f=new FileOutputStream("abc1.txt");
    
    String k="helloworld";
    byte b[]=k.getBytes();
    
    for(int i=0;i<b.length;i++)
    f.write(b[i]);
    
    f.close();

    System.out.println("Written in file");
}
}
