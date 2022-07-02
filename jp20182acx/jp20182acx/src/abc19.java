
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class abc19 {
public static void main(String s[]) throws FileNotFoundException, IOException
{
    FileWriter f=new FileWriter("abc1.txt");
        
    String k="helloworld";
    char b[]=k.toCharArray();
    
    f.write(b);
    
    f.close();

    System.out.println("Written in file");
}
}
