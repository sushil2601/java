import java.applet.*;
import java.awt.*;

public class abcx1 extends Applet implements Runnable
{
String s;
int x;
Thread p;
public void init()
{
x=0;
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
   x++;
   if(x==getWidth()-30)
    break;

   repaint();
  Thread.sleep(50);
}
}
catch(Exception e)
{
e.printStackTrace();
}

}

public void paint(Graphics g)
{
g.drawString(s,x,100);
}
}