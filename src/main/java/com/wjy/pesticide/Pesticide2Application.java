package com.wjy.pesticide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jerrywang
 */
@SpringBootApplication
@RestController
public class Pesticide2Application {

    public static void main(String[] args) {
        SpringApplication.run(Pesticide2Application.class, args);
    }
}
