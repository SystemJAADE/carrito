package com.elitgamaliel.carrito;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.elitgamaliel.carrito.*" })
public class CarritoApplication {

	private static final Logger logger = LogManager.getLogger(CarritoApplication.class.getName());

	public static void main(String[] args) {
		logger.debug("This is a debug message");
		logger.debug("This is a info message");
		logger.debug("This is a warn message");
		logger.debug("This is a error message");
		logger.debug("This is a fatal message");
		SpringApplication.run(CarritoApplication.class, args);
	}

}
