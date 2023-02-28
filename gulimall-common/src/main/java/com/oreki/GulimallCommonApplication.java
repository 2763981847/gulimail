package com.oreki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Fu Qiujie
 * @since ${DATE}
 */
@SpringBootApplication
public class GulimallCommonApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallCommonApplication.class, args);
    }
}