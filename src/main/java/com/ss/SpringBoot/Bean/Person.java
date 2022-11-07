package com.ss.SpringBoot.Bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author ss
 * @create 2022-10-31 8:32
 */
@Component
@Data
public class Person {
    private String name;
    private Integer age;
    private Pet pet;
    private Car car;

}
