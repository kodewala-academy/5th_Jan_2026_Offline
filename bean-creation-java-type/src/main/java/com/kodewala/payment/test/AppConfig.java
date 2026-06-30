package com.kodewala.payment.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        return new Address("Bangalore", "Karnataka");
    }

    @Bean
    public Employee employee() {
        return new Employee(101, "John", address());
    }
}