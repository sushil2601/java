
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class n3 {
    public static void main(String s[]) throws Exception
   {
      URL k=new URL("http://www.realinfotech.in");
      URLConnection p=k.openConnection();
      
      InputStream z=p.getInputStream();
      
      int d;
      while((d=z.read())!=-1)
      {
          System.out.print((char)d);
      }
     
      z.close();
   }
}
