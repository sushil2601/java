
import java.applet.Applet;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class abc1 extends Applet implements MouseListener {

    public void init()
    {
        addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
          setBackground(Color.red);
    }

    @Override
    public void mousePressed(MouseEvent e) {
   
    }

    @Override
    public void mouseReleased(MouseEvent e) {
   
    }

    @Override
    public void mouseEntered(MouseEvent e) {
   
    }

    @Override
    public void mouseExited(MouseEvent e) {
   
    }
    
}
