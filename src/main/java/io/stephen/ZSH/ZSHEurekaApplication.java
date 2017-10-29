package io.stephen.ZSH;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 10447
 * @since 2017/8/13
 */
@SpringBootApplication
@EnableEurekaServer
public class ZSHEurekaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZSHEurekaApplication.class)
                .web(true).run(args);
    }
}
