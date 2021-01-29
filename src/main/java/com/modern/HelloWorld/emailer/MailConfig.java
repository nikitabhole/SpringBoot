package com.modern.HelloWorld.emailer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailConfig {
	//IEmailerService emailService = new DummyEmailSender();
		/*@Bean
		@Profile("prod")
		public iEmailerService dummyEmailSender() {
			return new DummyEmailSender();
		}*/
		
		@Bean
	//@Primary
		@Profile("dev")
		public iEmailerService smtpEmailSender(JavaMailSender javaMailSender) {
			return new SmtpEmailSender(javaMailSender);
		}
}
