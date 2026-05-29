package com.katleo.spring_boot_4_usermanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain  customSecurityFilterChain(HttpSecurity http){
        http.authorizeHttpRequests(req ->
                req.requestMatchers("/account/**",
                        "/balance/**",
                        "/card/**",
                        "/loan/**").authenticated()
                    .requestMatchers("/contact/**", "/notice/**").permitAll());
        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails adminUser = User.withUsername("katey")
                .password("{noop}katey")
                .authorities("read", "write")
                .build();
        UserDetails normalUser = User.withUsername("tim")
                .password("{noop}tim")
                .authorities("read")
                .build();

        return new InMemoryUserDetailsManager(adminUser, normalUser);
    }
}
