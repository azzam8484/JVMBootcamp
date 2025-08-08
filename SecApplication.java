package com.Security.sec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository repo, PasswordEncoder encoder) {
		return args -> {
			if (repo.findByUsername("john").isEmpty()) {
				AppUser user = new AppUser();
				user.setUsername("john");
				user.setPassword(encoder.encode("password123"));
				user.setRole("ROLE_USER");
				repo.save(user);
			}
		};
	}



}
