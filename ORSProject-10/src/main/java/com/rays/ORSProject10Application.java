package com.rays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Main class of ORS Project.
 * 
 * This class starts the Spring Boot application and configures CORS and
 * Interceptor settings.
 * 
 * @author Aastik Sahu
 */
@SpringBootApplication
public class ORSProject10Application {

	/**
	 * Main method to run the Spring Boot application.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		SpringApplication.run(ORSProject10Application.class, args);
		System.out.println("ors project 10 class started");
	}

	/**
	 * Configure CORS and Interceptor for the application.
	 * 
	 * @return WebMvcConfigurer object
	 */
	@Bean
	public WebMvcConfigurer corsConfig() {
		WebMvcConfigurer w = new WebMvcConfigurer() {

			/**
			 * Allow cross origin requests from Angular application.
			 */
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200")
						.allowedMethods("*").allowedHeaders("*")
						.allowCredentials(true);
			}
			
		};
		return w;
	}

}
