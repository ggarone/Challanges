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

//	@Override
//	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
//		super.configure(auth);
//		auth.inMemoryAuthentication()
//        .withUser("operatore").password("{noop}operatore1234").roles("OPERATORE")
//        .and()
//        .withUser("admin").password("{noop}admin1234").roles("ADMIN");
//	}
//
////	@Bean
////	public PasswordEncoder passwordEncoder() {
////		
////		return  new BCryptPasswordEncoder();
////	}
//
//	@Override
//	protected void configure(final HttpSecurity http) throws Exception {
//		super.configure(http);
//		 http
//	      .csrf().disable()
//	      .authorizeRequests()
//	      .antMatchers("/admin/**").hasRole("ADMIN")
//	      .antMatchers("/gestione/**").hasRole("OPERATORE")
//	      .antMatchers("/login").permitAll()
//	      .anyRequest().authenticated()
//	      .and()
//	      .formLogin()
//	      .loginPage("/login.html")
//	      .loginProcessingUrl("/perform_login")
//	      .defaultSuccessUrl("/login/homepage.html", true)
//	      .failureUrl("/login.html?error=true")
//	      .failureHandler(authenticationFailureHandler())
//	      .and()
//	      .logout()
//	      .logoutUrl("/perform_logout")
//	      .deleteCookies("JSESSIONID")
//	      .logoutSuccessHandler(logoutSuccessHandler());
//	}
//
//	private LogoutSuccessHandler logoutSuccessHandler() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private AuthenticationFailureHandler authenticationFailureHandler() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
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
				.failureUrl("/login?error")
				.failureHandler(authenticationFailureHandler())
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

private AuthenticationFailureHandler authenticationFailureHandler() {
		// TODO Auto-generated method stub
		return new CustomAuthenticationFailureHandler();
	}

//	@SuppressWarnings("deprecation")
//	@Bean
//	@Override
//	public UserDetailsService userDetailsService() {
//		UserDetails user =
//			 User.withDefaultPasswordEncoder()
//				.username("admin")
//				.password("admin")
//				.roles("ADMIN")
//				.build();
//		
//		UserDetails user2 =
//				 User.withDefaultPasswordEncoder()
//					.username("operatore")
//					.password("operatore")
//					.roles("OPERATORE")
//					.build();
//
//		return new InMemoryUserDetailsManager(user, user2);
//	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth
		.inMemoryAuthentication()
		.withUser("admin").password("{noop}admin").roles("ADMIN")
		.and()
		.withUser("operatore").password("{noop}operatore").roles("OPERATORE");
		
	}
	
	
	
	
}
