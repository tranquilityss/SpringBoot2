package com.ss.SpringBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ss
 * @create 2022-10-28 15:00
 */
@RestController
public class demo {
    @RequestMapping("/")
    public String ind(){
        return "你好";
    }
}
