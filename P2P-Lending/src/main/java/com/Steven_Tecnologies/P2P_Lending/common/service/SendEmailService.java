package com.Steven_Tecnologies.P2P_Lending.common.service;


import lombok.extern.log4j.Log4j2;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class SendEmailService {


    private String defaultFrom;

    private String defaultTo;

    private String defaultCc;

    private String defaultBcc;

    private String subject;

    private String body;

    private JavaMailSender mailSender;


}
