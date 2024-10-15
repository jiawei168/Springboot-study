package org.example.configures.controller;


import lombok.AllArgsConstructor;
import org.example.configures.entity.Mail;
import org.example.configures.service.EmailService;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin
public class EmailController {
    private EmailService emailService;

    @PostMapping("/mail")
    public void sendEmail(@RequestBody Mail mail) {
            emailService.sendSimpleEmail(mail.getTo(), mail.getSubject(), mail.getBody());
    }
}
