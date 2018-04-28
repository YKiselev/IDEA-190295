package com.github.ykiselev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Yuriy Kiselev (uze@yandex.ru).
 */
@SpringBootApplication
public class App {

    @Bean
    String first() {
        return "Hello!";
    }

    @Bean
    String second() {
        return "Good bye or " + first();
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
