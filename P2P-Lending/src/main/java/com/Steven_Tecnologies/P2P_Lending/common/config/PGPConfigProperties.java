package com.Steven_Tecnologies.P2P_Lending.common.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "pgp")
//@PropertySource("file:cfg/pgp.properties")
public class PGPConfigProperties {

    @Value("")
    private String secKeyId;

    @Value("")
    private String secPassphrase;

    @Value("")
    private String secretKeyFile;

    @Value("")
    private String publicKeyFile;
}
