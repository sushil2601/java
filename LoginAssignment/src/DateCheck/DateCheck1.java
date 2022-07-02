/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateCheck;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author realinfo
 */
public class DateCheck1 {

    public static void main(String s[]) {
        DateCheck1.isValidDate();
    }

    public static void isValidDate() {
        
        try {
            
            String cdate = "15-15-2018";
            Date d = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
            Date g=sd.parse(cdate);
            

            System.out.println("Valid");
            
            

        } catch (Exception ex) {
            System.out.println("NOT Valid");
        }
        
        

    }

}
