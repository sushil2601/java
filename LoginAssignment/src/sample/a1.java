/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author realinfo
 */
public class a1 extends JFrame{
    
    JScrollPane sp;
    Panel p;
    public a1()
    {
         p=new Panel();
      GridLayout g=new GridLayout(200,2);
      p.setLayout(g);
      JButton b[]=new JButton[400];
      
      for(int i=0;i<400;i++)
      {
         
          b[i]=new JButton("Button"+i);
          p.add(b[i]);
      }
      sp=new JScrollPane(p);
      add(sp);
     // add(p);
    }
    
  public static void main(String s[])
  {
     
      a1 x=new a1();
      x.setVisible(true);
        x.setSize(300, 300);

  }
    
    
}
