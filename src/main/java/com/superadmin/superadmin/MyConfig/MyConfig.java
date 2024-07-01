package com.superadmin.superadmin.MyConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@Configuration
public class MyConfig {

    @Bean
public UserDetailsService userDetailsService() {
    UserDetails userDetails = User.builder().
            username("Success")
            .password(passwordEncoder().encode("Success")).roles("ADMIN").
            build();
    return new InMemoryUserDetailsManager(userDetails);
}

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }



}



