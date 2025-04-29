package DABS.DABS;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF (for Postman testing)
            .authorizeHttpRequests()
            .anyRequest().permitAll(); // Allow all requests without authentication

        return http.build();
    }
}



//CSRF Protection (Cross-Site Request Forgery).
//@Bean = Make this method produce a Spring-managed object (a bean).
//SecurityFilterChain = A chain of rules for security (like allow, block, etc).
//HttpSecurity http = Object that allows us to configure how requests are handled.
