package de.kopfgarn.tmpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(value = "de.kopfgarn.tmpl")
public class MainApplication { //extends CommandLineRunnerBean {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}