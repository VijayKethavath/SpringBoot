package com.example.Security.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Configurations {
	
	@Bean
	public UserDetailsService userdetailssevice() {
		   //interface
		
		UserDetails user1 = User.withDefaultPasswordEncoder()
		//interface          class provide by spring security and static method of the user class		
				.username("root")
				.password("123456")
				.roles("USER")
				.build();
		
		UserDetails user2 = User.withDefaultPasswordEncoder()
				.username("vijay")
				.password("152210")
				.roles("USER")
				.build();
		
		UserDetails user3 = User.withDefaultPasswordEncoder()
				.username("Admin")
				.password("admin123")
				.roles("ADMIN")
				.build();	
		
		return new InMemoryUserDetailsManager(user1,user2,user3);
		          // is a class that implements userdetailsService
		
	}

	@Bean
	public SecurityFilterChain securityfilerchain(HttpSecurity http)  throws Exception {
return
	http.csrf(csrf->csrf.disable())
        .authorizeHttpRequests(t->t.requestMatchers("/hi").authenticated())
		.authorizeHttpRequests(t->t.anyRequest().permitAll())
		.formLogin(Customizer.withDefaults())
		.httpBasic(Customizer.withDefaults())
		.build();
	
}
}


/*/
 * 
 *                     Spring Security
                          |
                          ↓
                 UserDetailsService
                     (INTERFACE)
                          ↑
                          |
            InMemoryUserDetailsManager
                     (CLASS)
                          |
                 ┌────────┴────────┐
                 ↓                 ↓
             user1              user2
                 |                 |
              UserDetails       UserDetails
              (INTERFACE)       (INTERFACE)
                 ↑                 ↑
                 └────── User ─────┘
                         (CLASS)
 */
 
