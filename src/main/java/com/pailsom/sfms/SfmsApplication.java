package com.pailsom.sfms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
public class SfmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfmsApplication.class, args);
	}

}
