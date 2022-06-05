package com.spring_framework.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean bean = context.getBean("testBean", TestBean.class);

        System.out.println(bean);
        context.close();
    }
}
