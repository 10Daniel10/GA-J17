package com.test.ga;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Properties;
import java.io.InputStream;

@RestController
public class User {

Properties prop = new Properties();
InputStream input = Main.class.getClassLoader().getResourceAsStream("config.properties");
prop.load(input);

String name = prop.getProperty("nombre");
String surename = prop.getProperty("apellido");

    @GetMapping("/user")
    public String saludo(){
        return name + surename;
    }
}
