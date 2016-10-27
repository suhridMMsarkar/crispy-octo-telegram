package com.suhrid;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by suhrid on 10/27/16.
 */

@Configuration
@ComponentScan(basePackages = "com.suhrid")
@EnableWebMvc
public class AppConfig {
}
