package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	@Bean 
	public MemberDetailsService memberDetailsService() {
		return new MemberDetailsService();
		
	}
	
	@Bean 
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(memberDetailsService());
		provider.setPasswordEncoder(passwordEncoder());
		return provider; 
	}
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests(
				(requests) -> requests
				.requestMatchers("/").permitAll()
				.requestMatchers("/view").permitAll()
				.requestMatchers("/categories").permitAll()
				.requestMatchers("/category/add").hasRole("ADMIN")
				.requestMatchers("/category/edit/*").hasRole("ADMIN")
				.requestMatchers("/category/delete/*").hasRole("ADMIN")
				.requestMatchers("/item").permitAll()	
				.requestMatchers("/item/add").hasRole("ADMIN")
				.requestMatchers("/item/edit/*").hasRole("ADMIN")
				.requestMatchers("/item/delete/*").hasRole("ADMIN")
				.requestMatchers("/members").hasRole("ADMIN")
				.requestMatchers("/bootstrap//").permitAll()
				.requestMatchers("/images/*").permitAll()				
				.anyRequest().authenticated())	
				.formLogin((form) -> form.permitAll().defaultSuccessUrl("/",true))
				//.formLogin().loginPage("/login").permitAll()
				
				.logout((logout) -> logout.permitAll())	
				.exceptionHandling().accessDeniedPage("/403");
				
		return http.build();
	}
}
