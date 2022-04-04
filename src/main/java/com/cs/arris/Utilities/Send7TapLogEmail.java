package com.cs.arris.Utilities;

import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Send7TapLogEmail {
	public static void main(String[] args) {

        
        String to = "fromaddress@gmail.com";// Recipient's email ID needs to be mentioned.     
        String from = "toaddress@gmail.com"; // Sender's email ID needs to be mentioned
        String host = "smtp.gmail.com"; // Assuming you are sending email from through gmails smtp

        Properties properties = System.getProperties();// Get system properties

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

//            protected PasswordAuthentication getPasswordAuthentication() {
//
//                return new PasswordAuthentication("fromaddress@gmail.com", "*******");
//
//            }

        });
        session.setDebug(true);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("This is the Subject Line!");
            message.setText("This is actual message");

            System.out.println("sending...");
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }


}
