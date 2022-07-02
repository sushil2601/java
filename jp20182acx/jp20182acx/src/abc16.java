
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class abc16 {
public static void main(String s[]) throws FileNotFoundException, IOException
{
    FileInputStream f=new FileInputStream("abc1.txt");
    
    int k;
    while((k=f.read())!=-1)
    {
    System.out.print((char)k);
    }
    
    f.close();

    
}
}
