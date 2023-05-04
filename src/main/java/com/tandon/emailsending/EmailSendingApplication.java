package com.tandon.emailsending;

import com.tandon.emailsending.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSendingApplication {
@Autowired
private EmailSenderService senderService;
	public static void main(String[] args) {

		SpringApplication.run(EmailSendingApplication.class, args);
	}
@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmail("hukumsingh9854@gmail.com","this is subject of this spring mail","body of the mail");
}
}
