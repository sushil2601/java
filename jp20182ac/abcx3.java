import java.applet.*;
import java.awt.*;

public class abcx3 extends Applet 
{
int x;
xyz k;
public void init()
{
x=0;
k=new xyz(this);
}


public void paint(Graphics g)
{
g.setColor(Color.RED);
g.fillOval(x,70,100,100);
}
}

