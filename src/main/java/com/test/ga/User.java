package com.test.ga;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@RestController
public class User {

    private Properties prop = new Properties();
    private String name;
    private String surename;

    public User() {
        try {
            InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties");
            prop.load(input);

            name = prop.getProperty("nombre");
            surename = prop.getProperty("apellido");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/user")
    public String saludo() {
        return name + surename;
    }
}
/*@RestController
public class User {

    private String name = System.getenv("nombre");
    private String surename = System.getenv("apellido");

    @GetMapping("/user")
    public String saludo() {
        return name + " " + surename;
    }
}
*/
