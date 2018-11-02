package com.example.demo1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author THLiu
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.example.demo1.service")
public class Demo1Config {
}
