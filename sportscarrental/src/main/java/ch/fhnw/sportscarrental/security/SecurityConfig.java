package ch.fhnw.sportscarrental.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.core.userdetails.User;

import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;
/* Testing 2*/
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService users() {
        //Create two users with different roles and add them to the in-memory user store

        return new InMemoryUserDetailsManager(
            User.withUsername("myuser")
                .password("{noop}password")
                .authorities("READ","ROLE_USER")
                .build(), 
            User.withUsername("myadmin")
                .password("{noop}password")
                .authorities("READ","ROLE_ADMIN")
                .build());

    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/menu").hasRole("USER") //note that the role need not be prefixed with "ROLE_"
                        .requestMatchers("/menu/pizza**").hasRole("ADMIN") //note that the role need not be prefixed with "ROLE_"
                        .requestMatchers("/menu**",
                                                    "/**", //allow access to the home page
                                                    "/swagger-ui.html", //allow access to the swagger UI
                                                    "/v3/api-docs/**",  //allow access to the swagger API documentation
                                                    "/swagger-ui/**").permitAll() //allow access to the swagger UI
                        .anyRequest().hasAuthority("SCOPE_READ")           
                )       
                .formLogin(withDefaults()) //need to include a static import for withDefaults, see the imports at the top of the file
                .httpBasic(withDefaults())
                .build(); 
    }      
}
