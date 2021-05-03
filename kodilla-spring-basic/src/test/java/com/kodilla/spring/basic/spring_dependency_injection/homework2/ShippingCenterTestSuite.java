package com.kodilla.spring.basic.spring_dependency_injection.homework2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework2");

    @Test
    public void shippingCenterTest() {
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        assertEquals("Package delivered to: Adres", bean.sendPackage("Adres", 25));
        assertEquals("Package not delivered to: Adres", bean.sendPackage("Adres", 40));
    }

}
