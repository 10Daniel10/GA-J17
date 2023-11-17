package com.test.ga;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Properties;

@RestController
public class User {

Properties prop = new Properties();
String name = prop.getProperty("nombre");
String apellido = prop.getProperty("apellido");

    @GetMapping("/user")
    public String saludo(){
        return nombre + apellido;
    }
}
