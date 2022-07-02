
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class abc17 {
public static void main(String s[]) throws FileNotFoundException, IOException
{
    FileInputStream f=new FileInputStream("abc1.txt");
    
    byte b[]=new byte[3];
    
    int k;
    
    while((k=f.read(b))>0)
    {
    System.out.println(k); //number of bytes read
    String h=new String(b,0,k);
    System.out.println(h);
    }
    
    f.close();

    
}
}
