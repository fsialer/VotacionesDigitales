package org.codigorupestre.spacenative.votodigital.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.codigorupestre.spacenative.votodigital")
@PropertySource("classpath:/datasource.properties")
public class AppConfig {

}
