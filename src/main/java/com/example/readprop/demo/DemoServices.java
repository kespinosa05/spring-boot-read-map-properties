package com.example.readprop.demo;

import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties({ CountryProperties.class })
public class DemoServices {

    private final CountryProperties jpaProperties;

    public DemoServices(CountryProperties jpaProperties) {
        this.jpaProperties = jpaProperties;
    }

    public void printProperties(){
        System.out.println("printProperties:Default:"+jpaProperties.getDefault_value());
        System.out.println("printProperties:Languages:"+jpaProperties.getLanguages());

    }
}
