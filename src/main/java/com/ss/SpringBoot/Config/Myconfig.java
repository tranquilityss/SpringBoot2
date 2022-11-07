package com.ss.SpringBoot.Config;

import com.ss.SpringBoot.Bean.Pet;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;

/**
 * @author ss
 * @create 2022-10-29 15:37
 */
//这个相当于application.xml
@Configuration
public class Myconfig {
    @Bean
    public Pet Tom() {
        return new Pet("tom",5);
    }

}
