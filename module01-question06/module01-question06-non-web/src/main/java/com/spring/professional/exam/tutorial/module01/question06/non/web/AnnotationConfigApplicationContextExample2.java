package com.spring.professional.exam.tutorial.module01.question06.non.web;

import com.spring.professional.exam.tutorial.module01.question06.non.web.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextExample2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(
                "com.spring.professional.exam.tutorial.module01.question06.non.web.beans"
        );

        SpringBean1 bean = context.getBean(SpringBean1.class);

        bean.sayHello();
    }
}
