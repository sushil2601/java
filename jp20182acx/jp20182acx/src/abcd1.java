
import javax.swing.JFrame;

public class abcd1 extends JFrame {
    
    abcd k;
    public abcd1()
    {
        k=new abcd();
        k.setSize(400,400);
        setSize(400,400);
                
        add(k);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public static void main(String s[])
    {
        abcd1 p=new abcd1();
        p.setVisible(true);
    }
}
