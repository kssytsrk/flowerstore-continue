package com.uculabs.demo;

import java.util.List;

import com.uculabs.demo.flowerstore.Chamomile;
import com.uculabs.demo.flowerstore.FlowerColor;
import com.uculabs.demo.flowerstore.Rose;
import com.uculabs.demo.flowerstore.Tulip;

import com.uculabs.demo.delivery.DHLDeliveryStrategy;
import com.uculabs.demo.delivery.PostDeliveryStrategy;
import com.uculabs.demo.payment.CreditCardPaymentStrategy;
import com.uculabs.demo.payment.PayPalPaymentStrategy;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/order")
    public static List<Order> list() {

        Order firstOrder = new Order(List.of(new Rose(),
                new Tulip(9, FlowerColor.RED, 10)),
                new DHLDeliveryStrategy(),
                new PayPalPaymentStrategy());

        Order secondOrder = new Order(List.of((new Rose()),
                new Tulip(2, FlowerColor.BLUE, 3),
                new Chamomile()),
                new PostDeliveryStrategy(),
                new CreditCardPaymentStrategy());

        return List.of(firstOrder, secondOrder);
    }

    @RequestMapping("/")
    public static String error() {
        return "Error. Are you looking for /controller?";
    }
}