import java.applet.*;
import java.awt.*;

public class abcx extends Applet implements Runnable
{
String s;
Thread p;
public void init()
{
s="Hello";
p=new Thread(this);
p.start();
}

public void run()
{
try
{
while(true)
{
  if(s.equals("Hello"))
    s="";
  else
    s="Hello";
   repaint();
  Thread.sleep(1000);
}
}
catch(Exception e)
{
e.printStackTrace();
}

}

public void paint(Graphics g)
{
g.drawString(s,100,100);
}
}