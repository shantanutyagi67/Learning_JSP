package com.shantanu;
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
import java.io.IOException;
import java.util.UUID;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		response.setContentType("text/html");
				
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("emailid");
		String password=request.getParameter("pwd");
		LoginBean bean=new LoginBean();
		bean.setFname(fname);
		bean.setLname(lname);
		bean.setEmailid(email);
		bean.setPassword(password);
		//mail---
		/*String to = bean.getEmailid(); 
	    String from = "shantanutyagi67@gmail.com"; 
	    String host = "localhost";//or IP address  
	    Properties properties = System.getProperties();  
	    properties.setProperty("mail.smtp.host", host);  
	    Session session = Session.getDefaultInstance(properties); 
	    try{  
	         MimeMessage message = new MimeMessage(session);  
	         message.setFrom(new InternetAddress(from));  
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	         message.setSubject("hello "+bean.getFname());  
	         message.setText("Hello, this is example of sending email  "); 
	         Transport.send(message);  
	         System.out.println("message sent successfully....");  
	  
	      }catch (MessagingException mex) {mex.printStackTrace();}  
	    */
		//Get properties object
		/*String from="shantanutyagi67@gmail.com";
		String password2="233767543Hacker9099654327";
		String to=bean.getEmailid();
		String sub="hello "+bean.getFname();
		String msg="you have successfully registered!";
        Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");    
        //get Session   
        Session session = Session.getDefaultInstance(props,    
         new javax.mail.Authenticator() {    
         protected PasswordAuthentication getPasswordAuthentication() {    
         return new PasswordAuthentication(from,password2);  
         }    
        });    
        //compose message    
        try {    
         MimeMessage message = new MimeMessage(session);    
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
         message.setSubject(sub);    
         message.setText(msg);    
         //send message  
         Transport.send(message);    
         System.out.println("message sent successfully");    
        } catch (MessagingException e) {throw new RuntimeException(e);}    */
		
		final String username = "shantanutyagi67@gmail.com";
        final String password2 = "233767543Hacker9099654327";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

//        Session session = Session.getInstance(props,
//          new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(username, password2);
//            }
//          });

//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("shantanutyagi67@gmail.com"));
//            message.setRecipients(Message.RecipientType.TO,
//                InternetAddress.parse("shantanutyagi67@gmail.com"));
//            message.setSubject("A testing mail header !!!");
//            message.setText("Dear Mail Crawler,"
//                + "\n\n No spam to my email, please!");
//
//            Transport.send(message);
//
//            System.out.println("Done");
//
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
		
		String myObjectId = UUID.randomUUID().toString();
		request.getSession().setAttribute(myObjectId,bean);
		request.getSession().setAttribute("myObjectId", myObjectId);
		RequestDispatcher rd=request.getRequestDispatcher("/index2.jsp");
		rd.forward(request, response);


}
}