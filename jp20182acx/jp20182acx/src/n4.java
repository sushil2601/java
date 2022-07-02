
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class n4 {
    public static void main(String s[]) throws Exception
   {
      URL k=new URL("http://www.realinfotech.in");
      URLConnection p=k.openConnection();
      
      InputStream z=p.getInputStream();
      FileOutputStream y=new FileOutputStream("a1.html");
      int d;
      while((d=z.read())!=-1)
      {
          y.write(d);
      }
     
      y.close();
      z.close();
      System.out.println("Page downloaded");
   }
}
