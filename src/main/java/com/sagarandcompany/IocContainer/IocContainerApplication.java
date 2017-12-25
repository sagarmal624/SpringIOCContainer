package com.sagarandcompany.IocContainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class IocContainerApplication {

    public static void main(String[] args) {
//		SpringApplication.run(IocContainerApplication.class, args);
//        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("E:/STS/WorkPlace/SpringIoC/src/main/resources/bean.xml");

        Resource resource = new ClassPathResource("bean.xml");

        BeanFactory factory = new XmlBeanFactory(resource);

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        UserService userService = (UserService) factory.getBean("userService");
        System.out.println(userService.toString());
    }
}
