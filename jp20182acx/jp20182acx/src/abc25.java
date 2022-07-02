
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class abc25 {
public static void main(String s[]) throws Exception
{
InputStreamReader p=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(p);

System.out.println("Input String:");
String h=b.readLine();
System.out.println(h);

b.close();
p.close();    
}
}
