package com.modern.HelloWorld.controller;
import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modern.HelloWorld.emailer.iEmailerService;


@RestController

public class EmailServiceController {
//iEmailerService emailService = new  DummyEmailSender();
	
	// Don't create any object with specific type let spring create it.we are asking to create with the help of autowired concept
	// @Autowired //at instance variable
	
	iEmailerService emailService;
	// http://localhost:8080/sendemail
	
	public iEmailerService getEmailService() {
		return emailService;
	}


    //@Autowired // at setter method
	/*public void setEmailService(iEmailerService dummyEmailSender) {
		this.emailService = dummyEmailSender ;
	}*/
	
    @Autowired // using constructor
	public EmailServiceController (iEmailerService abc)  {
		this.emailService = abc;
	}
	
	
	
	@RequestMapping("/sendemail")
	public String email() throws MessagingException{
		//call sendEMail method
		emailService.sendEmail("stevejobs@apple.com", "Launching of new Apple Model", "Body of the email");
		
		return "Email Sent";
	}




	
}
