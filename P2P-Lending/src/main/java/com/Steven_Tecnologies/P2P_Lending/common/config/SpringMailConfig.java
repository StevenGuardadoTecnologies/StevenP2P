package com.Steven_Tecnologies.P2P_Lending.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class SpringMailConfig {

    @Bean
    public JavaMailSender testSender( @Value("") String host,
                                      @Value("") int port,
                                      @Value("") String username,
                                      @Value("") String password){

        return createMailSender(host, port, username, password);

    }

    public JavaMailSender prodSender(
            @Value("") String host,
            @Value("") int port,
            @Value("") String username,
            @Value("") String password
    ){

        return createMailSender(host, port, username, password);


    }


    private JavaMailSender createMailSender(String host, int port, String username, String password){
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(host);
        mailSender.setPort(port);
        mailSender.setUsername(username);
        mailSender.setPassword(password);

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.smtp.auth", "false");
        props.put("mail.smtp.starttls.enable", "false");
        return mailSender;

    }
}
