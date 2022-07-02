
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class abc20 {
public static void main(String s[]) throws FileNotFoundException, IOException
{
    FileWriter f=new FileWriter("abc1.txt");
        
    String k="testworld";
    
    f.write(k);
    
    f.close();

    System.out.println("Written in file");
}
}
