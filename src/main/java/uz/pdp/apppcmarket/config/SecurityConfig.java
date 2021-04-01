package uz.pdp.apppcmarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import uz.pdp.apppcmarket.constants.Roles;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth
                .inMemoryAuthentication()

                .withUser("super_admin").password(passwordEncoder().encode("super_admin"))
                .roles("SUPER_ADMIN")
                .authorities("ADD_PRODUCT", "READ_ALL_PRODUCTS", "READ_ONE_PRODUCT", "EDIT_PRODUCT", "DELETE_PRODUCT", "ORDER_OPERATIONS")

                .and()

                .withUser("moderator").password(passwordEncoder().encode("moderator"))
                .roles("MODERATOR").authorities("ADD_PRODUCT", "EDIT_PRODUCT")

                .and()

                .withUser("operator").password(passwordEncoder().encode("operator"))
                .roles("OPERATOR").authorities("ORDER_OPERATIONS");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/api/product").hasAuthority("ADD_PRODUCT")
                .antMatchers(HttpMethod.GET, "/api/product").hasAuthority("READ_ALL_PRODUCTS")
                .antMatchers(HttpMethod.GET, "/api/product/*").hasAuthority("READ_ALL_PRODUCTS")
                .antMatchers(HttpMethod.PUT, "/api/product/*").hasAuthority("EDIT_PRODUCTS")
                .antMatchers(HttpMethod.DELETE, "/api/product/*").hasAuthority("DELETE_PRODUCT")
                .antMatchers("/api/order").hasAuthority("ORDER_OPERATIONS")
                .antMatchers("/api/order/**").hasAuthority("ORDER_OPERATIONS")
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();

    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
