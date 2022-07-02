
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class n5 {
    public static void main(String s[]) throws Exception
   {
      URL k=new URL("https://www.mfiles.co.uk/mp3-downloads/bach-bourree-in-e-minor-piano.mp3");
      URLConnection p=k.openConnection();
      
      InputStream z=p.getInputStream();
      FileOutputStream y=new FileOutputStream("a1.mp3");
      int d;
      while((d=z.read())!=-1)
      {
          y.write(d);
      }
     
      y.close();
      z.close();
      System.out.println("Song downloaded");
   }
}
