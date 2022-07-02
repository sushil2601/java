
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class abc26 {
   public static void main(String s[]) throws Exception
   {
       Student s1=new Student(100,"aman",98.2f);
       
       FileOutputStream f=new FileOutputStream("abc.bin");
       ObjectOutputStream k=new ObjectOutputStream(f);
       
       k.writeObject(s1);
       
       k.close();
       f.close();
       
       System.out.println("Data written");
       
   }
}
