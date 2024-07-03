/*
 * package com.admin.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfig {
 * 
 * @Bean public PasswordEncoder passwordEncoder() { return new
 * BCryptPasswordEncoder(); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { http
 * .authorizeRequests() .antMatchers("/", "/register", "/buyer/**",
 * "/seller/**", "/admin/**").permitAll() // Allow public access to these
 * endpoints .anyRequest().authenticated() .and() .formLogin()
 * .loginPage("/login") .permitAll() .and() .logout() .permitAll();
 * 
 * // Optionally, configure additional security settings // For example, CSRF
 * protection can be disabled for simplicity in this demo http.csrf().disable();
 * } }
 */