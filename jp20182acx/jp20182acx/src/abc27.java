
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class abc27 {
   public static void main(String s[]) throws Exception
   {
       Student x;
       
       FileInputStream f=new FileInputStream("abc.bin");
       ObjectInputStream k=new ObjectInputStream(f);
       
       x=(Student)k.readObject();
       
       System.out.println(x);
       
       k.close();
       f.close();
       
       
   }
}
