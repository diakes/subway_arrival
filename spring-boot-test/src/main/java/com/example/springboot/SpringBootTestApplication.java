//package com.example.springboot;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
////import org.springframework.boot.autoconfigure.SpringBootApplication;
//@ComponentScan
//@Configuration
//@EnableAutoConfiguration
////@SpringBootApplication
//public class SpringBootTestApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringBootTestApplication.class, args);
//	}
//	
//	@Bean
//    public InternalResourceViewResolver setupViewResolver() {
// 
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
// 
//        resolver.setPrefix("/WEB-INF/jsp/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
//
//}
package com.example.springboot;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@ComponentScan
@Configuration
@EnableAutoConfiguration
public class SpringBootTestApplication {
 
    public static void main(String[] args) {
    SpringApplication.run(SpringBootTestApplication.class, args);
    }
 
    @Bean
    public InternalResourceViewResolver setupViewResolver() {
 
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
 
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
