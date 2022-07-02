
import java.net.InetAddress;
import java.net.UnknownHostException;

public class n1 {
    public static void main(String s[]) throws UnknownHostException 
   {
       InetAddress k=InetAddress.getByName("desktop-mhlr52v");
       String p=k.getHostAddress();
       System.out.println(p);
   }
}
