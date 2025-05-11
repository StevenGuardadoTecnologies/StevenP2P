package com.Steven_Tecnologies.P2P_Lending;

import com.Steven_Tecnologies.P2P_Lending.common.config.JwtProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(JwtProperties.class)
public class P2PLendingApplication {

	public static void main(String[] args) {
		SpringApplication.run(P2PLendingApplication.class, args);
	}

}
