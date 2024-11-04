package com.uculabs.demo.flowercontroller;


import com.uculabs.demo.flowerstore.Flower;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/flower")
public class FlowerController {
    private final FlowerService fs;
    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.fs = flowerService;
    }
    @GetMapping
    public List<Flower> getFlowers() {
        return fs.getFlowers();
    }
    @PostMapping()
    public void addFlower(@RequestBody Flower flower){
        fs.addFlower(flower);
    }

 /*    @RequestMapping("/controller")
    public String control() {
        StringBuilder msg = new StringBuilder();

        for (Order order : DemoApplication.list()) {
            msg.append(order.processOrder()).append("</br>");
        }
        return msg.toString();
    } */
}