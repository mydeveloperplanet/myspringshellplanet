package com.mydeveloperplanet.myspringshellplanet;

import com.mydeveloperplanet.myspringshellplanet.examples.CustomExceptionResolver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.command.annotation.CommandScan;

@SpringBootApplication
//@EnableCommand(HelloWorld.class)
@CommandScan
public class MySpringShellPlanetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringShellPlanetApplication.class, args);
	}

	@Bean
	CustomExceptionResolver customExceptionResolver() {
		return new CustomExceptionResolver();
	}

}
