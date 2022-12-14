package com.spring.professional.exam.tutorial.module01.question19.proxy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        context.registerShutdownHook();
    }
}
