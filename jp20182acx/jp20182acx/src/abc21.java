
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class abc21 {
public static void main(String s[]) throws FileNotFoundException, IOException
{
    FileReader f=new FileReader("abc1.txt");
    
    int k;
    while((k=f.read())!=-1)
    {
    System.out.print((char)k);
    }
    
    f.close();

    
}
}
