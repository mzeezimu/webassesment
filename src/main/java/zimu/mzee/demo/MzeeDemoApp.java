package zimu.mzee.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class MzeeDemoApp implements WebMvcConfigurer {


    public static void main(String[] args) {

        SpringApplication.run(MzeeDemoApp.class,args);
    }
}
