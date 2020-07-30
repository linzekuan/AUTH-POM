package com.lambert.sso.web.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lambert
 * @version $Id: Starter.java, v 0.1 2020年07月30日 9:43 PM lambert Exp $
 */
@SpringBootApplication
@ComponentScan("com.lambert.sso")
public class Starter extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
    }
}