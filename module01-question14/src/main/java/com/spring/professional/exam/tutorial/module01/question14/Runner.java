package com.spring.professional.exam.tutorial.module01.question14;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        context.registerShutdownHook();
    }
}
