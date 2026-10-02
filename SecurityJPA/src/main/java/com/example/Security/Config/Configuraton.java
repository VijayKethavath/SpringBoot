package com.example.Security.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Configuraton {

	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder(12);
	}
	
	@Bean
	public SecurityFilterChain securityfilerchain(HttpSecurity http)  throws Exception {
return
	http.csrf(csrf->csrf.disable())
        .authorizeHttpRequests(t->t.requestMatchers("/register").permitAll())
		.authorizeHttpRequests(t->t.anyRequest().authenticated())
		.formLogin(Customizer.withDefaults())
		.httpBasic(Customizer.withDefaults())
		.build();
	
}

}
