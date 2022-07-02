
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class abc24 {
public static void main(String s[]) throws FileNotFoundException, IOException
{
    FileReader f=new FileReader("abc1.txt");
    BufferedReader b=new BufferedReader(f);
    
    String k;
    while((k=b.readLine())!=null)
    {
    System.out.println(k);
    }
    
    b.close();
    f.close();

    
}
}
