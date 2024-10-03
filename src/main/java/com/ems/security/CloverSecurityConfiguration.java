//package com.ems.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
//
//@Configuration
//public class CloverSecurityConfiguration extends WebSecurityConfigurerAdapter{
//	@Autowired
//    public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth.inMemoryAuthentication()
//            .passwordEncoder(NoOpPasswordEncoder.getInstance())
//        		.withUser("admin").password("admin")
//                .roles("USER","ADMIN");
//    }
//	
//	 @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http.authorizeRequests().antMatchers("/login","/h2-console/**").permitAll()
//                 .antMatchers("/","/*clover*/**").access("hasRole('USER')").and()
//                 .formLogin();
//        
//         http.csrf().disable();
//         http.headers().frameOptions().disable();
//    }
//
//
////	  @Override   //This is changes we applied to remove security //
////    protected void configure(HttpSecurity http) throws Exception {
////        http
////            .authorizeRequests()
////            .antMatchers("/").permitAll()  // Allow access to the root and other public URLs
////            .anyRequest().authenticated()  // All other URLs require authentication
////            .and()
////            .csrf().disable();  // Disable CSRF protection for testing (not recommended for production)
////    }
//}
