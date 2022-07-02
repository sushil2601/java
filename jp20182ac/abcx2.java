import java.applet.*;
import java.awt.*;

public class abcx2 extends Applet implements Runnable
{
int x;
Thread p;
public void init()
{
x=0;
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
g.drawOval(x,70,100,100);
}
}