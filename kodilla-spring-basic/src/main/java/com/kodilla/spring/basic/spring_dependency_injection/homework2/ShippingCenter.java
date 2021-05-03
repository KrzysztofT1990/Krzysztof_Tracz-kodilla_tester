package com.kodilla.spring.basic.spring_dependency_injection.homework2;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ShippingCenter {

    @Resource(name = "deliveryService")
    private DeliveryService deliveryService;
    @Resource(name = "notificationService")
    private NotificationService notificationService;

    // tutaj dodaj odpowiednie wstrzykiwanie zależności

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}