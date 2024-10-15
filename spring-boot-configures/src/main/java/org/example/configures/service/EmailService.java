package org.example.configures.service;

import jakarta.annotation.Resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailService {
    @Resource
    private JavaMailSender mailSender;
    @Value("${spring.mail.username}")
    private String from;

    public void sendSimpleEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        // 发件人邮箱
        message.setFrom(from);
        // 收件人邮箱
        message.setTo("2983532292@qq.com");
        // 邮件主题
        message.setSubject("测试邮件标题");
        // 邮件内容
        message.setText("测试邮件内容");
        // 发送邮件
        mailSender.send(message);
        log.info("邮件已发送！");
    }
}
