/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mailtest;

import java.util.Properties;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class mailtest {
    
    public static void main(String s[])
    {
        try
        {
        mailtest.sendEmail("team@realinfotech.in","Test Mail","Helloo WOrld test todsdy");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
      public static boolean sendEmail(String to, String subject, String message) throws Exception {
        String from = "Test Mail1111";      

        /* CONNECTING TO MAIL SERVER & AUTHENTICATING */
        final String username = "june2018@zoho.com";
        final String password = "June123!@#";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.zoho.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.zoho.com");

        Session sn = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(username, password);
                    }
                });

        //compose message
        javax.mail.Message msg = new MimeMessage(sn);
        msg.setFrom(new InternetAddress(username, from));

        InternetAddress[] parse = InternetAddress.parse(to, true);
        msg.setRecipients(javax.mail.Message.RecipientType.TO, parse);
        msg.setSubject(subject);
        // msg.setText(message);
        msg.setContent(message, "text/html; charset=utf-8");
        msg.setSentDate(new java.util.Date());

        msg.saveChanges();

        /* SEND MESSAGE */
        Transport.send(msg);

        return true;

    }
    
}
