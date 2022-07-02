/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author realinfo
 */
public class a2 extends JFrame {

     JTable j1;
   JPanel p;
   JScrollPane jp;
      public a2() {
        p = new JPanel();
       
         try {
            String heading[] = new String[3];
            heading[0]="Emp Id";
            heading[1]="Name";
            heading[2]="Contact";

           String data[][]={{"a","b","c"},{"a","b","c"},{"a","b","c"}};
           j1 = new JTable(data,heading);
           jp=new JScrollPane(j1);
           add(jp);

        } catch (Exception ex) {
            ex.printStackTrace();
  }    
    }
    
    
    
    public static void main(String s[]) {

        a2 x = new a2();
        x.setVisible(true);
        x.setSize(300, 300);

    }

}
