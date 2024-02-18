package com.catrion.catrionbe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.catrion.catrionbe.utils.JwtTokenCreatorFilter;
import com.catrion.catrionbe.utils.JwtTokenValidationFilter;
 
@Configuration
public class CatrionSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .addFilterBefore(new JwtTokenValidationFilter(), BasicAuthenticationFilter.class)
                .addFilterAfter(new JwtTokenCreatorFilter(), BasicAuthenticationFilter.class)
                .authorizeRequests()
                .antMatchers("/studentInfo").authenticated()
                .antMatchers("/register").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/getStudentRoles").hasAuthority("ROLE_WRITE")
                .and()
                .httpBasic().and().csrf().disable();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}