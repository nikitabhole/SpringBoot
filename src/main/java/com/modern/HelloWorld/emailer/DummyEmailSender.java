package com.modern.HelloWorld.emailer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;

//WHen application gets started, Spring checks @Component annotation and if found
//then it create the instance of the class and store it in ApplicationContext.

//@Component
//@Primary
//@Qualifier("dummy")
public class DummyEmailSender implements iEmailerService {
	private static Log log=LogFactory.getLog(DummyEmailSender.class);
	@Override
	public void sendEmail(String emailID, String subject, String mailContent) {
		// TODO Auto-generated method stub
		log.info("Dummy mail receiver ID:"+emailID);
		log.info("Dummy mail subject:"+subject);
		log.info("Dummy mail body:"+mailContent);
		log.warn("This is just a Dummy email sender");
	}

}
