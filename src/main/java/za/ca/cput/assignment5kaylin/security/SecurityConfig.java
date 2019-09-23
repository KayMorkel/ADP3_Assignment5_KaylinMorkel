package za.ca.cput.assignment5kaylin.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.inMemoryAuthentication()
        .withUser("warden")
        .password(encodePassword().encode("warden"))
        .roles("ADMIN")
        .and()
        .withUser("churchGoer")
        .password(encodePassword().encode("churchgoer"))
        .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and()
                .authorizeRequests()
                //.anyRequest().authenticated();
                .antMatchers("**/create/**", "**/read/**")
                .hasRole("ADMIN")
                .and().csrf().disable();
                //.formLogin().disable();
    }

    @Bean
    public PasswordEncoder encodePassword()
    {
        return new BCryptPasswordEncoder();
    }
}
