
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class abc23 {
public static void main(String s[]) throws FileNotFoundException, IOException
{
    FileReader f=new FileReader("abc1.txt");
    
    char b[]=new char[3];
    
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
