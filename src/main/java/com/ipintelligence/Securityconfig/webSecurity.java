package com.ipintelligence.Securityconfig;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class webSecurity {
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;
	
	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())  // REST API = disable CSRF
            .authorizeHttpRequests(auth -> auth
            	.requestMatchers("/User/register").permitAll()
                .anyRequest().authenticated()                  // Everything else requires login
            )
            .httpBasic(org.springframework.security.config.Customizer.withDefaults());              // ENABLE BASIC AUTH

        return http.build();
    }
	
	
	 @Bean
	    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
	        return http.getSharedObject(AuthenticationManagerBuilder.class)
	                .userDetailsService(customUserDetailsService)
	                .passwordEncoder(passwordEncoder())
	                .and()
	                .build();
	    }
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();   // ← Plain text password
    }
	
	
	
	
	
	

}
