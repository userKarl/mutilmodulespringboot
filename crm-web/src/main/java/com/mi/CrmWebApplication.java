package com.mi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Hello world!
 *
 */
@EnableWebMvc
@SpringBootApplication
@ComponentScan({"com.mi"})
@MapperScan(basePackages= {"com.mi.mapper"})
public class CrmWebApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(CrmWebApplication.class, args);
    }
}
