package org.main_java.messengerclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MessengerClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(MessengerClient1Application.class, args);
    }

}
