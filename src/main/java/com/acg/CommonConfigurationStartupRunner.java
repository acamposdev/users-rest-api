package com.acg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommonConfigurationStartupRunner implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(CommonConfigurationStartupRunner.class);
	
    @Override
    public void run(String...args) throws Exception {
    	logger.debug("Configurando propiedades generales");
    }
}