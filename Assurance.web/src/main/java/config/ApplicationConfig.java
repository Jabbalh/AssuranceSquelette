package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Nico on 21/01/2016.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"config","services"})
public class ApplicationConfig extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationConfig.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationConfig.class);
    }
}
