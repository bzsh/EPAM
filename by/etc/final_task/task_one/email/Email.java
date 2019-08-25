package by.etc.final_task.task_one.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {

    private static String libraryEmail = "library@library.com";
    private static String password = "12345678899";

    public static void sendEmail(String from, String email, String text) {
        Properties prop = new Properties();
        prop.put("mail.transport.protocol", "smtps");
        prop.put("mail.smtps.host", libraryEmail);
        prop.put("mail.smtps.auth", "true");
        prop.put("mail.smtp.sendpartial", "true");
        Session session = Session.getDefaultInstance(prop);
        try {
            Transport transport = session.getTransport();
            transport.connect("smtp.gmail.com", 465,libraryEmail, password);
            MimeMessage mm = new MimeMessage(session);
            mm.setSubject("Library email sender: from " + from);
            mm.setText(text);
            System.out.println("Send_Email");
            mm.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            transport.sendMessage(mm, mm.getRecipients(Message.RecipientType.TO));
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
