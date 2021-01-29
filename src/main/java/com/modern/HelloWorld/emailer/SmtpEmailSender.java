package com.modern.HelloWorld.emailer;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;


//The object created by @Component referred as Beans
//@Component("smtpbean")
//@Primary
//@Qualifier("smtp")
public class SmtpEmailSender implements iEmailerService {

private static Log log=LogFactory.getLog(SmtpEmailSender.class);
private JavaMailSender javaMailSender;

public SmtpEmailSender(JavaMailSender javaMailSender) {
	this.javaMailSender = javaMailSender;
	
}
@Override
public void sendEmail(String emailID, String subject, String mailContent) throws MessagingException{
		//  Auto-generated method stub
		log.info("SMTP mail receiver id:"+emailID);
		log.info("SMTP mail subject:"+subject);
		log.info("SMTP mail body:"+mailContent);
		log.warn("This is just a SMTP email sender");
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;
		helper = new MimeMessageHelper(message, true); // true indicates
 					  				                   // multipart message
		helper.setSubject("This is test message");
		helper.setTo("bhosaleaditya170@gmail.com");
		helper.setText("Hello,How are you?", true); // true indicates html

		// continue using helper for more functionalities
        // like adding attachments, etc.  
		
        javaMailSender.send(message);
	}
}

