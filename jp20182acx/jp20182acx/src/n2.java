
import java.net.InetAddress;
import java.net.UnknownHostException;

public class n2 {
    public static void main(String s[]) throws UnknownHostException 
   {
       byte b[]={(byte)192,(byte)168,(byte)1,(byte)224};
       InetAddress k=InetAddress.getByAddress(b);
       String p=k.getHostName();
       System.out.println(p);
   }
}
