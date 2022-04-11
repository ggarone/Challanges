package com.garone.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecSecurityConfig extends WebSecurityConfigurerAdapter{
	
	private AuthenticationSuccessHandler authenticationSuccessHandler;
	
	@Autowired
	public SecSecurityConfig(AuthenticationSuccessHandler authenticationSuccessHandler) {
		this.authenticationSuccessHandler = authenticationSuccessHandler;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/admin").hasAnyRole("ADMIN")
				.antMatchers("/operatore").hasAnyRole("OPERATORE")
				.antMatchers("/admin/**").hasAnyRole("ADMIN")
				.antMatchers("/operatore/**").hasAnyRole("OPERATORE")
				.antMatchers("/prenotazioni").hasAnyRole("ADMIN")
				.antMatchers("/list").hasAnyRole("OPERATORE")
				.antMatchers("/login").permitAll()
				.antMatchers("/index").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.successHandler(authenticationSuccessHandler)
				.permitAll()
				.and()
				.logout()
				.logoutSuccessUrl("/login")
				.logoutUrl("/perform_logout")
				.invalidateHttpSession(true)
				.deleteCookies("JSESSIONID")
				.and()
				.csrf().disable();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth
		.inMemoryAuthentication()
		.withUser("admin").password("{noop}admin").roles("ADMIN")
		.and()
		.withUser("operatore").password("{noop}operatore").roles("OPERATORE");
		
	}
}
