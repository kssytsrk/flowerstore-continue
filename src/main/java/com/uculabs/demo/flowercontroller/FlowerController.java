package com.uculabs.demo.flowercontroller;

import com.uculabs.demo.Order;
import com.uculabs.demo.DemoApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowerController {
    @RequestMapping("/controller")
    public String control() {
        StringBuilder msg = new StringBuilder();

        for (Order order : DemoApplication.list()) {
            msg.append(order.processOrder()).append("</br>");
        }
        return msg.toString();
    }
}