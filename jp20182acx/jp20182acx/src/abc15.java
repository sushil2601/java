
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class abc15 {
public static void main(String s[]) throws FileNotFoundException, IOException
{
    FileOutputStream f=new FileOutputStream("abc1.txt");
        
    String k="helloworld";
    byte b[]=k.getBytes();
    
    f.write(b);
    
    f.close();

    System.out.println("Written in file");
}
}
