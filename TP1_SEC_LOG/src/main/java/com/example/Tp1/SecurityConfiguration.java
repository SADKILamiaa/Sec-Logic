package com.example.Tp1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/Admin").hasRole("admin")
                .antMatchers("/Login").hasRole("user1")
                .anyRequest().authenticated()
                .and().formLogin()
                .and().httpBasic().disable()
        ;



    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return (PasswordEncoder)new BCryptPasswordEncoder();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails userDetails = User.builder()
                .username("user1")
                .password(passwordEncoder().encode("user1")).
                roles("USER" ).build();

        UserDetails userDetails1 = User.builder()
                .username("admin")
                .password(passwordEncoder().encode("admin")).
                roles("admin" ).build();


        return new InMemoryUserDetailsManager(
                userDetails,userDetails1
        );
    }
}