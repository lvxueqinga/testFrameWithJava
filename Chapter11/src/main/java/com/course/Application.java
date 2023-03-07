package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PreDestroy;

/**
 * @program：testFrameWithJava
 * @author: lvxueqing
 * @create: 2023/03/07 15:55
 *
 * spring 入口 不需要改其他内容
 *
 */

@SpringBootApplication
@EnableScheduling
public class Application {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        Application.context = SpringApplication.run(Application.class,args);
    }

    @PreDestroy
    public void close(){
        Application.context.close();

    }
}
