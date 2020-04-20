package com.bahamut.security.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
			.antMatchers("/webjars/**", "/css/**", "/img/**", "/js/**" ).permitAll()
			.antMatchers("/", "/login").permitAll()
			
			
			.anyRequest().authenticated()
			.and()
				.formLogin()
				.loginPage("/login").permitAll()
				.defaultSuccessUrl("/home", true)
				.failureUrl("/login-error").permitAll()
			.and()
				.logout()
				.logoutSuccessUrl("/login");
			
	}

}
