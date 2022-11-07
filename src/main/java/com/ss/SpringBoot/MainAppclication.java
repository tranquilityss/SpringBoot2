package com.ss.SpringBoot;

import com.ss.SpringBoot.Bean.Person;
import com.ss.SpringBoot.Bean.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ss
 * @create 2022-10-28 14:56
 */
@SpringBootApplication
public class MainAppclication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainAppclication.class, args);
        Pet tom = run.getBean("Tom", Pet.class);
        Person bean = run.getBean(Person.class);

        System.out.println(bean);
    }
}
